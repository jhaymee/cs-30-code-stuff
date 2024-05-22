class Ball {
    int x, y , r;
    int cr, cg, cb; // rgb values

    // Constructor Method
    Ball(int ballx, int bally, int ballr) {
        x = ballx; // sets x coord
        y = bally; // y coord
        r = ballr; // sets radius

    }

    void display() {
        circle(x,y,r);
    }

}