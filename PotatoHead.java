public class PotatoHead
{ 

    //instance variables - to be used in all methods in the class 
    private int numberOfHats; //private int length; 
    private boolean glasses;
    private String colorOfNose;
    private String shapeOfNose;
    private boolean mustache;
    /*************************************************************************/ 

    //constructors 
    //default constructor 
    public PotatoHead() 
    { 
        numberOfHats = 2;
        glasses = true;
        colorOfNose = "red";
        shapeOfNose = "round";
        mustache = true;
    }
    //give initial values to all the instance variables that are declared as private } 
    //initializer/ parameterized constructor 
    public PotatoHead(int n, boolean g, String c, String s, boolean m) 
    { 
        //set instance variables to parameter values
        numberOfHats = n;
        glasses = g;
        colorOfNose = c;
        shapeOfNose = s;
        mustache = m;

    } 
    /******************************************************/ 

    //Accessor Methods 
    public int getnumberOfHats() 
    { 
        return numberOfHats; 
    } 

    public boolean getglasses() 
    { 
        return glasses; 
    } 
    public String getcolorOfNose() 
    { 
        return colorOfNose; 
    } 
    public String getshapeOfNose() 
    { 
        return shapeOfNose; 
    } 
    public boolean getmustache() 
    { 
        return mustache; 
    } 

    /**********************************************************************/ 

    //mutator methods 
    public void setnumberOfHats(int n) 
    { 
        numberOfHats = n; 
    }       
    public void setglasses(boolean g) 
    { 
        glasses = g; 
    }  
    public void setcolorOfNose(String c) 
    { 
        colorOfNose = c; 
    } 
    public void setshapeOfNose(String s) 
    { 
        shapeOfNose = s; 
    } 
    public void setmustache(boolean m) 
    { 
        mustache = m; 
    } 
    /********************************************************************/ 

    //Other methods 
    /*****************************************************/


    //toString 
    public String toString() 
    { 
        return "The number of hats is " + numberOfHats; 
    } 
    /*****************************************************/ //main method 
    public static void main (String [] args) 
    { 
        //create objects or instances
        PotatoHead charles = new PotatoHead();
        //call or access constructors
        PotatoHead wallace = new PotatoHead(1, false, "blue", "square", true);
        //call or access (test) all of the methods
        int wallaceHats = wallace.getnumberOfHats();
        wallace.setnumberOfHats(4);
        wallaceHats = wallace.getnumberOfHats();
        boolean wallaceGlasses = wallace.getglasses();
        wallace.setglasses(false);
        wallaceGlasses = wallace.getglasses();
        int charlesHats = charles.getnumberOfHats();
        boolean charlesGlasses = charles.getglasses();
        String wallaceNose = wallace.getcolorOfNose() + " " + wallace.getshapeOfNose();
        System.out.println(charlesHats + "," + charlesGlasses + "," + wallaceHats + "," + wallaceGlasses + "," + wallaceNose);
        System.out.println(wallace.toString());
    }
}
