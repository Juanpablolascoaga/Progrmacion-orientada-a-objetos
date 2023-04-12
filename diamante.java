package Imagenes;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class diamante {
	static int width = 800;
	static int height = 800;
	
	static Color bluish = new Color(96,178, 213);
	
	 static Graphics2D g;

	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    private final static int PIXEL_SIZE = 38;
	    private final static Color[][] PIXELS = {
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
	    };
	    
	    public static void paint() {
	    	drawBackground(PIXEL_SIZE, Color.white);     
	        drawHorizontalLine(5, 15, 2, Color.black);
	        drawHorizontalLine(4, 16, 3, Color.black);
	        drawHorizontalLine(3, 17, 4, Color.black);
	        drawHorizontalLine(2, 18, 5, Color.black);
	        drawHorizontalLine(2, 18, 5, Color.black);
	        drawHorizontalLine(2, 18, 6, Color.black);//
	        drawHorizontalLine(4, 16, 7, Color.black);
	        drawHorizontalLine(5, 15, 8, Color.black);
	        drawHorizontalLine(6, 14, 9, Color.black);
	        drawHorizontalLine(7, 13, 10, Color.black);
	        drawHorizontalLine(8, 12, 11, Color.black);
	        drawHorizontalLine(9, 11, 12, Color.black);
	        drawHorizontalLine(10, 10, 13, Color.black);
	        
	        drawHorizontalLine(3, 17, 7, Color.black);
	        drawHorizontalLine(4, 16, 8, Color.black);
	        drawHorizontalLine(5, 15, 9, Color.black);
	        drawHorizontalLine(6, 14, 10, Color.black);
	        drawHorizontalLine(7, 13, 11, Color.black);
	        drawHorizontalLine(8, 12, 12, Color.black);
	        drawHorizontalLine(9, 11, 13, Color.black);
	        drawHorizontalLine(10, 10, 14, Color.black);
	        
	        drawHorizontalLine(5, 15, 3, bluish);
	        drawHorizontalLine(4, 16 , 4, bluish);
	        drawHorizontalLine(3, 17, 5, bluish);
	        drawHorizontalLine(4, 16, 7, bluish);
	        drawHorizontalLine(5, 15, 8, bluish);
	        drawHorizontalLine(6, 14, 9, bluish);
	        drawHorizontalLine(7, 13, 10, bluish);
	        drawHorizontalLine(8, 12, 11, bluish);
	        drawHorizontalLine(9, 11, 12, bluish);
	        drawHorizontalLine(10, 10, 13, bluish);
	        
	        putPixel(8,3,Color.BLACK);
	        putPixel(12,3,Color.BLACK);
	        putPixel(7,4,Color.BLACK);
	        putPixel(13,4,Color.BLACK);
	        putPixel(6,5,Color.BLACK);
	        putPixel(14,5,Color.BLACK);
	        putPixel(6,7,Color.BLACK);
	        putPixel(14,7,Color.BLACK);
	        putPixel(7,8,Color.BLACK);
	        putPixel(13,8,Color.BLACK);
	        putPixel(8,9,Color.BLACK);
	        putPixel(12,9,Color.BLACK);
	        putPixel(9,10,Color.BLACK);
	        putPixel(11,10,Color.BLACK);
	        putPixel(10,11,Color.BLACK);
	        drawSquareGrid(PIXEL_SIZE, Color.BLACK);
	        
	        try {       
	        	String folderPath = "C:\\Users\\maest\\eclipse-workspace\\main\\src\\Imagenes";
	            ImageIO.write(image, "jpg", new File(folderPath + "\\diamante.jpg"));
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
