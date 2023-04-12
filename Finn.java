package Imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Finn {
	    static int width = 920;
	    static int height = 920;
	    
	    static Color darkBlue = new Color(33,87,176);
	    static Color softBlue = new Color(74,164,224);
	    static Color skin = new Color(234, 200, 172);
	    static Color green = new Color (89,191,56);
	    
	    static Graphics2D g;

	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    private final static int PIXEL_SIZE = 40;
	    private final static Color[][] PIXELS = {
	            {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
	            {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	            {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
	            {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	            {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
	        };
	    
	    public static void paint() {
	    	drawBackground(PIXEL_SIZE, Color.white);
	    	drawHorizontalLine(6, 7, 4, Color.black);
	    	drawHorizontalLine(15, 16, 4, Color.black);
	    	drawHorizontalLine(5, 17, 5	, Color.black);	
	    	drawHorizontalLine(5, 17, 6	, Color.black); 
	    	drawHorizontalLine(5, 17, 7	, Color.black);	
	    	drawHorizontalLine(5, 17, 8	, Color.black); 
	    	drawHorizontalLine(5, 17, 9	, Color.black);	
	    	drawHorizontalLine(5, 17, 10, Color.black); 
	    	drawHorizontalLine(5, 17, 11, Color.black);	
	    	drawHorizontalLine(4, 18, 12, Color.black);
	    	drawHorizontalLine(4, 18, 13, Color.black);	
	    	drawHorizontalLine(4, 18, 14, Color.black); 
	    	drawHorizontalLine(4, 18, 15, Color.black);	
	    	drawHorizontalLine(4, 18, 16, Color.black); 
	    	drawHorizontalLine(5, 17, 17, Color.black);	
	    	drawHorizontalLine(5, 17, 18, Color.black);
	    	drawHorizontalLine(6, 8, 19,  Color.black);	
	    	drawHorizontalLine(14, 16, 19, Color.black);
	    	    	
	    	drawHorizontalLine(6, 7, 5, Color.WHITE);
	    	drawHorizontalLine(15, 16, 5, Color.WHITE);
	    	drawHorizontalLine(6, 16, 6, Color.WHITE);
	    	drawHorizontalLine(6, 16, 7, Color.WHITE);
	    	drawHorizontalLine(6, 16, 8, Color.WHITE);
	    	drawHorizontalLine(6, 16, 9, Color.WHITE);
	    	drawHorizontalLine(6, 16, 10, Color.WHITE);
	    	drawHorizontalLine(6, 16, 11, Color.WHITE);
	    	drawHorizontalLine(6, 16, 12, Color.WHITE);
	    	
	    	drawHorizontalLine(8, 14, 7, skin);
	    	drawHorizontalLine(7, 15, 8, skin);
	    	drawHorizontalLine(7, 15, 9, skin);
	    	drawHorizontalLine(7, 15, 10, skin);
	    	drawHorizontalLine(8, 14, 11, skin);
	    	
	    	drawHorizontalLine(8, 8, 9, Color.black);
	    	drawHorizontalLine(14, 14, 9, Color.black);
	    	drawHorizontalLine(10, 12, 10, Color.black);
	    	
	    	drawHorizontalLine(5, 6, 12, green);
	    	drawHorizontalLine(16, 17, 12, green);
	    	drawVerticalLine(13, 14, 6, green);
	    	drawVerticalLine(13, 14, 16, green);
	    	
	    	drawVerticalLine(13, 15, 5, skin);
	    	drawVerticalLine(13, 15, 17, skin);
	    	
	    	drawHorizontalLine(7, 15, 13, softBlue);
	    	drawHorizontalLine(7, 15, 14, softBlue);
	    	drawHorizontalLine(6, 16, 15, softBlue);
	    	drawHorizontalLine(6, 16, 16, softBlue);
	    	
	    	drawHorizontalLine(6, 16, 17, darkBlue);
	    	drawHorizontalLine(6, 8, 18, darkBlue);
	    	drawHorizontalLine(14, 16, 18, darkBlue);
	    	
	    	drawSquareGrid(PIXEL_SIZE, Color.black);
	    	
	    	 try {       
	    		 String folderPath = "C:\\Users\\maest\\eclipse-workspace\\main\\src\\Imagenes";
		            ImageIO.write(image, "jpg", new File(folderPath + "\\Finn.jpg"));
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