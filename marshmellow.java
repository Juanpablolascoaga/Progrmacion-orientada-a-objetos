package Imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class marshmellow {
	static int width = 900;
    static int height = 900;
    
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
        drawHorizontalLine(0, 17, 0, Color.black);
        drawHorizontalLine(0, 17,17, Color.black);
        drawVerticalLine(0,17,0,Color.BLACK);
        drawVerticalLine(0,17,17,Color.BLACK);
        
        drawVerticalLine(5,6,2,Color.BLACK);
        drawVerticalLine(8,9,2,Color.BLACK);
        drawVerticalLine(6,9,3,Color.BLACK);
        drawVerticalLine(7,8,4,Color.BLACK);
        drawVerticalLine(6,9,5,Color.BLACK);
        drawVerticalLine(5,6,6,Color.BLACK);
        drawVerticalLine(8,9,6,Color.BLACK);
        
        drawVerticalLine(5,6,11,Color.BLACK);
        drawVerticalLine(8,9,11,Color.BLACK);
        drawVerticalLine(6,9,12,Color.BLACK);
        drawVerticalLine(7,8,13,Color.BLACK);
        drawVerticalLine(6,9,14,Color.BLACK);
        drawVerticalLine(5,6,15,Color.BLACK);
        drawVerticalLine(8,9,15,Color.BLACK);
        
        drawVerticalLine(13,14,2,Color.BLACK);
        drawHorizontalLine(2, 4, 14, Color.black);
        drawHorizontalLine(13, 15, 14, Color.black);
        drawHorizontalLine(4, 13, 15, Color.black);
        drawVerticalLine(13,14,15,Color.BLACK);
        drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
        	String folderPath = "C:\\Users\\maest\\eclipse-workspace\\main\\src\\Imagenes";
            ImageIO.write(image, "jpg", new File(folderPath + "\\marshmellow.jpg"));
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
