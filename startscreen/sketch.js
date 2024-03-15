// Start Screen
// Jhaymee Bisenio
// 13 Mar 2024
// Create a start screen and something that happens after it using functions

// State variable for the button
let buttonPressed = false;

// Button object to store all of the button variable together
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);
  
  //Set the initial properties of myButton
  //subtract 1/2 the w and h from x and y to get true center
  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "red";
}

function draw() {
  background(220);

  if (buttonPressed===false) {
    //Calls the myButton function in the draw loop
    drawButton();
  }
}

//build in p5js funciton for mouse reactions
function mousePressed() {

  //Checks if the mouse is within the x coordinates of the button
  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {

    //Switch "true" out for a similar condition that checks y coordinates
    if(true) {
      buttonPressed = true;
    }

}

  if (mouseY > myButton.y && mouseY < (myButton.y + myButton.h)) {

    //Switch "true" out for a similar condition that checks y coordinates
    if(true) {
      buttonPressed = true;
    }

  }



//custom function that draws the button when called
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}

