package Assessment_3;

class Color {

    int red, green, blue;



    void Color() {

        red = 10;

        green = 10;

        blue = 10;

    }



    void printColor() {

        System.out.println("red: " + red + " green: " + green + " blue: " + blue);

    }

}



class Test1 {

    public static void main(String[] args) {

        Color color = new Color();

        color.printColor();

    }

}

