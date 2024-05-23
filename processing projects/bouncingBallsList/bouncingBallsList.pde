//Declaring the object
ArrayList<Ball> ballGroup = new ArrayList<Ball>();
// Ball[] ballGroup;
// int pos = 0;

void setup() {
    size(1400,700);

}

void draw() {
    background(70,30,50);

    for (int i = 0; i < ballGroup.size(); i++) {
        // ballGroup[i].display();
        // ballGroup[i].move();

        ballGroup.get(i).display();
        ballGroup.get(i).move();
    }
    
}

void mousePressed() {
    ballGroup.add(new Ball(mouseX, mouseY, 100));

    //Creates a new object at this array position
    // if (pos < ballGroup.length) {
    //     ballGroup[pos] = new Ball(mouseX, mouseY, 100);
    //     pos++;
    // }
}