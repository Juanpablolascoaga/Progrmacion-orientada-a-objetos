package Imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ROCKET {
	
	 static int width = 800;
	 static int height =1200;
	 
	 static Color greish = new Color(231,231,231);
	 static Color bluish = new Color(0,75,218);
	 static Color redish = new Color(209,5,0);
	 
	 static Graphics2D g;

	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    private final static int PIXEL_SIZE = 50;
	    private final static Color[][] PIXELS = {
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
	    };
	    
	    public static void paint() {
	    	drawBackground(PIXEL_SIZE, Color.white);
	    	drawHorizontalLine(7, 8, 3, Color.black);
	    	drawHorizontalLine(6, 9, 4, Color.black);
	    	drawHorizontalLine(5, 10, 5, Color.black);
	    	drawHorizontalLine(5, 10, 6, Color.black);
	    	drawHorizontalLine(4, 11, 7, Color.black);
	    	drawHorizontalLine(4, 11, 8, Color.black);//
	    	drawHorizontalLine(4, 11, 9, Color.black);
	    	drawHorizontalLine(4, 11, 10, Color.black);
	    	drawHorizontalLine(4, 11, 11, Color.black);
	    	drawHorizontalLine(5, 10, 12, Color.black);
	    	drawHorizontalLine(5, 10, 13, Color.black);
	    	drawHorizontalLine(4, 11, 14, Color.black);
	    	drawHorizontalLine(4, 11, 15, Color.black);
	    	drawHorizontalLine(4, 11, 16, Color.black);
	    	drawHorizontalLine(4, 11, 17, Color.black);
	    	drawHorizontalLine(4, 6, 18, Color.black);
	    	drawHorizontalLine(9, 11, 18, Color.black);
	    	drawHorizontalLine(5, 5, 19, Color.black);
	    	drawHorizontalLine(10, 10, 19, Color.black);
	    	
	    	drawVerticalLine(7, 10, 5, greish);
	    	drawVerticalLine(5, 12, 6, greish);
	    	drawVerticalLine(4, 14, 7, greish);
	    	drawVerticalLine(4, 14, 8, greish);
	    	drawVerticalLine(5, 12, 9, greish);
	    	drawVerticalLine(7, 10, 10, greish);
	    	
	    	drawVerticalLine(5, 6, 7, bluish);
	    	drawVerticalLine(5, 6, 8, bluish);
	    	drawVerticalLine(8, 9, 7, bluish);
	    	drawVerticalLine(8, 9, 8, bluish);
	    	drawVerticalLine(11, 12, 7, bluish);
	    	drawVerticalLine(11, 12, 8, bluish);
	    	
	    	drawVerticalLine(15, 18, 5, redish);
	    	drawVerticalLine(15, 18, 10, redish);
	    	drawSquareGrid(PIXEL_SIZE, Color.black);
	    	
	    	try {       
	    		String folderPath = "C:\\Users\\maest\\eclipse-workspace\\main\\src\\Imagenes";
	            ImageIO.write(image, "jpg", new File(folderPath + "\\rocket.jpg"));
	            System.out.println("Archivo guardado exitosamente.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void drawVerticalLine(int a, int b, int x, Color c){
	    	for(int i=a;i<=b;i++){
	     	   g.setColor(c);
	           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	        }
	    }
	    
	    private static void drawHorizontalLine(int a, int b, int y, Color c){
	        for(int i=a;i<=b;i++){
	     	   g.setColor(c);
	           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	        }
	    }
	    
	    private static void putPixel(int x, int y, Color c){       
		   g.setColor(c);
		   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
	    }
	    
	    private static void fillRect(int x, int y, int width, int height, Color c){
	    	g.setColor(c);
	    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
	    }
	    
	    private static void drawSquareGrid(int size, Color c) {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {                
	                g.setColor(c);
	                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	            }
	        }
	    }
	    private static void drawBackground(int size, Color c) {
	    	for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                g.setColor(c);
	                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
	            }
	        }
	    }
	    public static void main(String[] args) {
	        g = image.createGraphics();        
	        paint();
	    }
}
