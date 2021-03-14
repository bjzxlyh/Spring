package learnspring_2;

import org.springframework.beans.factory.annotation.Autowired;

public class people {
    @Autowired
    private cat c;
    @Autowired
    private dog d;
    private String name;

    public cat getC() {
        return c;
    }

    public void setC(cat c) {
        this.c = c;
    }

    public dog getD() {
        return d;
    }

    public void setD(dog d) {
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "people{" +
                "c=" + c +
                ", d=" + d +
                ", name='" + name + '\'' +
                '}';
    }
}
