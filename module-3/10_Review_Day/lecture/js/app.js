const player1 = {
    id: 1,
    char: 'x',
    iconClass: 'fa-times',
    scoreClass: '#score-player-1 .score-text'
};

const player2 = {
    id: 2,
    char: 'o',
    iconClass: 'fa-circle',
    scoreClass: '#score-player-2 .score-text'
};

let currentPlayer = player1;


function onTileClicked(e) {
   
}

function togglePlayAgain() {
  
}

function resetGame() {
    
}

function isAWin() {
    const icons = document.querySelectorAll('.fa');

    // horizontal check

        // top row
    

        // middle row
    

        // bottom row
    

    // vertical check

        // left column
    
        // middle column  
        
        // right column
   

    // diagonals
    
        // top left - bottom right
        

        // top right - bottom left
    

    return false;
}

function isATie() {
   
}

function recordWin() {
    
}

function recordTie() {
  
}

function switchPlayer() {
    
}

function addTileClickListeners() {
   
}

document.addEventListener('DOMContentLoaded', () => {
    
});