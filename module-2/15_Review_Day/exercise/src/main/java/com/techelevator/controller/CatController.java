package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public CatCard getRandomCatCard() {
        CatCard newCard = new CatCard();
        newCard.setCatFact(catFactService.getFact().getText());
        newCard.setImgUrl(catPicService.getPic().getFile());

        return newCard;

    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<CatCard> getAllCards() {
        return catCardDao.list();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "", method = RequestMethod.POST)
    public void saveNewCard(@Valid @RequestBody CatCard card) {
        catCardDao.save(card);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public void updateCard(@PathVariable long id, @Valid @RequestBody CatCard card) {
        catCardDao.update(id, card);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
        public void deleteCatCard(@PathVariable long id){
            catCardDao.delete(id);
        }
    }
