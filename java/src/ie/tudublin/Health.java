package ie.tudublin;

public class Health {
    float x, y;
    float fx, fy;
    float w;
    float halfW;

    YASC yasc;
    float rotation;

    public Health(float x, float y, float w, YASC yasc) {
        this.x = -50;
        this.y = yasc.random(yasc.height);
        this.w = w;
        this.fx = 1;
        this.fy = yasc.random(-5, 5);
        halfW = w / 2.0f;
        this.yasc =  yasc;
        this.rotation = 0;
    }

    public void render() {
        yasc.pushMatrix();
        yasc.translate(x, y);
        yasc.rotate(rotation);
        float halfW = w / 2;
        yasc.stroke(255);
        yasc.rectMode(YASC.CENTER);
        yasc.rect(x, y, w);
        
        yasc.popMatrix();
    }
}
