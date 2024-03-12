// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x, y;
let time = 0;


function setup() {
  createCanvas(windowWidth, windowHeight);
  x = width/2;
  y = height/2;
}

function draw() {
  background(220);

  x = noise(time) * width;
  y = noise(time) * height/2;

  fill("black");
  circle(x,50,40);

  fill("red");
  circle(300,y,50);

  time+=10;
}
