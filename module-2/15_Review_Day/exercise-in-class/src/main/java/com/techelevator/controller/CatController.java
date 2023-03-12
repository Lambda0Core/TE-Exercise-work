package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CatController {

    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

  @RequestMapping(path="", method = RequestMethod.GET)
  public List<CatCard> getALlCatCards(){
       return catCardDao.list();
  }

  @RequestMapping(path="/{id}",method = RequestMethod.GET)
  public CatCard getCatCard(@PathVariable long id){
        CatCard catCard = catCardDao.get(id);

        if(catCard == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CatCard not found.");
        }

        return catCard;
  }

  @RequestMapping(path="/random", method= RequestMethod.GET)
    public CatCard getRandomCatDetails(){
        CatCard newCatCard = new CatCard();
        newCatCard.setCatFact( catFactService.getFact().getText() );
        newCatCard.setImgUrl( catPicService.getPic().getFile() );

        return newCatCard;
  }

  @ResponseStatus(HttpStatus.CREATED)
  @RequestMapping(path="", method = RequestMethod.POST)
    public void saveCatCard(@Valid @RequestBody CatCard catCard){
        catCardDao.save(catCard);

  }

  @RequestMapping(path="/{id}", method= RequestMethod.PUT)
  public void update(@PathVariable long id, @Valid @RequestBody CatCard catCard){
        catCardDao.update(id, catCard);
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public void deleteCatCard(@PathVariable long id){
        catCardDao.delete(id);
  }
}
