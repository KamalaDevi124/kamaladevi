interface sooo {
    void draw();


    class Circle implements sooo{
        public void draw(){
            System.out.println("drawing circle");
        }
    }
    class Dero{
        public static void main(String[] args) {
            sooo b=new Circle();
            b.draw();

        }
    }
}
