import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GateMaster3000 extends JPanel implements MouseListener {
   static final int FPS = 1;
   static final int MSPF = 1000;
   static final int NONE = 0;
   static final int NOT = 1;
   static final int AND = 2;
   static final int OR = 3;
   static final int XOR = 4;
   static final int NAND = 5;
   static final int NOR = 6;
   static final int XNOR = 7;
   static final int INPUT = 8;
   static final int OUTPUT = 9;
   static final int XCOORD = 0;
   static final int YCOORD = 1;
   static final int ID = 2;
   boolean go = true;
   int screenWidth;
   int screenHeight;
   int[][] gates;
   int[] outputCoords;
   int[][] connections;
   boolean[][] targetOutput = new boolean[][]{new boolean[0], {true, false, true, true}, {false, false, false, true, false, true, true, false}, {false, false, false, true, false, true, true, false}};
   int[][] backrefs;
   int outputBackref;
   boolean[] powered;
   boolean checking = false;
   int numInputs;
   int selected = -1;
   int[][] gateSelectors;
   int gateSize = 50;
   int outputSize = 150;
   int inputSpacing = 10;
   int fontSize = 24;
   Color borderColor;
   Color selectionColor;
   Color outputBoxColor;
   Color outputLitColor;
   Color[] gateColors;
   Color[] wireColors;
   int checkButtonX;
   int checkButtonY;
   int checkButtonW;
   int checkButtonH;
   int errorTimer;
   int lockX;
   int lockY;
   int lockW;
   int lockH;
   private boolean cracked;
   private int lockID;
   long[] hashes;
   String[] info;

   public GateMaster3000(String var1, int var2, int var3) {
      this.borderColor = Color.BLACK;
      this.selectionColor = new Color(0, 255, 255);
      this.outputBoxColor = new Color(64, 64, 64);
      this.outputLitColor = new Color(255, 255, 0);
      this.gateColors = new Color[]{new Color(0, 0, 0, 0), new Color(255, 0, 0), new Color(0, 0, 255), new Color(0, 255, 0), new Color(128, 128, 0), new Color(255, 0, 255), new Color(128, 128, 128), new Color(255, 128, 0)};
      this.wireColors = new Color[]{new Color(0, 0, 0), new Color(255, 0, 0), new Color(0, 255, 0), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 0, 255), new Color(0, 255, 255), new Color(64, 64, 64), new Color(128, 0, 0), new Color(0, 128, 0), new Color(0, 0, 128), new Color(128, 128, 0), new Color(128, 0, 128), new Color(0, 128, 128)};
      this.checkButtonX = 640;
      this.checkButtonY = 50;
      this.checkButtonW = 140;
      this.checkButtonH = 60;
      this.errorTimer = 0;
      this.lockX = 640;
      this.lockY = 450;
      this.lockW = 120;
      this.lockH = 80;
      this.cracked = false;
      this.lockID = 0;
      this.hashes = new long[]{-1L, 14191L, 55198L, 39351L};
      this.info = new String[]{clarify("8Y^RSXQiaK]iSX]SNOj"), clarify("=XS^MRp]iKNN\\O]]$i0SVOi~{w^b^"), clarify("6YMUi|iVYMK^ONiK^i=^K\\^=M_\\`SO\\,\\KQQc5OO]^O\\<OMYX]YVSNK^SXQAK]RSO]^ui0SVOi{{"), clarify(":K]]MYNOi:SOMO$iX^icY_\\iM")};
      this.screenWidth = var2;
      this.screenHeight = var3;
      Scanner var4 = null;
      long var5 = 0L;

      try {
         var4 = new Scanner(new File(var1));
         this.numInputs = var4.nextInt();
         this.gates = new int[this.numInputs + var4.nextInt()][];
         this.connections = new int[this.gates.length][];

         int var7;
         for(var7 = 0; var7 < this.numInputs; ++var7) {
            this.gates[var7] = new int[]{var4.nextInt(), var4.nextInt(), 8};
         }

         for(var7 = this.numInputs; var7 < this.gates.length; ++var7) {
            this.gates[var7] = new int[]{var4.nextInt(), var4.nextInt(), 0};
         }

         int var8;
         for(var7 = 0; var7 < this.connections.length; ++var7) {
            this.connections[var7] = new int[var4.nextInt() * 2];

            for(var8 = 0; var8 < this.connections[var7].length; ++var8) {
               var5 += (long)((this.connections[var7][var8] = var4.nextInt()) * 7);
            }
         }

         var5 += (long)(this.numInputs + this.gates.length);

         for(var7 = 0; var7 < this.gates.length; ++var7) {
            var5 += (long)((var7 + 1) * this.gates[var7][0] + (var7 + 2) * this.gates[var7][1] * this.gates[var7][2]);
         }

         if (var5 != (long)var4.nextInt()) {
            this.loadError();
         }

         for(var7 = 0; var7 < this.hashes.length; ++var7) {
            if (var5 == this.hashes[var7]) {
               this.lockID = var7;
               break;
            }
         }

         this.powered = new boolean[this.gates.length];
         int[] var11 = new int[this.gates.length];
         this.backrefs = new int[this.gates.length][];

         int var9;
         for(var8 = 0; var8 < this.connections.length; ++var8) {
            for(var9 = 0; var9 < this.connections[var8].length; var9 += 2) {
               if (this.connections[var8][var9] > -1) {
                  ++var11[this.connections[var8][var9]];
               }
            }
         }

         for(var8 = 0; var8 < this.gates.length; ++var8) {
            this.backrefs[var8] = new int[var11[var8]];
            var11[var8] = 0;
         }

         for(var8 = 0; var8 < this.connections.length; ++var8) {
            for(var9 = 0; var9 < this.connections[var8].length; var9 += 2) {
               if (this.connections[var8][var9] > -1) {
                  this.backrefs[this.connections[var8][var9]][var11[this.connections[var8][var9]]] = var8;
                  ++var11[this.connections[var8][var9]];
               } else {
                  this.outputBackref = var8;
               }
            }
         }

         this.outputCoords = new int[]{600, 200};
         this.gateSelectors = new int[8][2];

         for(var8 = 0; var8 < 8; ++var8) {
            this.gateSelectors[var8][0] = 200 + var8 * this.gateSize;
            this.gateSelectors[var8][1] = 500;
         }

         this.setFocusable(true);
         this.addMouseListener(this);
      } catch (Exception var10) {
         var10.printStackTrace();
         this.loadError();
         if (var4 != null) {
            var4.close();
         }

         System.exit(0);
      }

   }

   public void loadError() {
      System.out.print(clarify("/\\\\Y\\$i3X`KVSNiVYMUiqwOSVriPSVOwi=R_^^SXQiNYaX"));

      try {
         Thread.sleep(500L);
      } catch (Exception var5) {
      }

      System.out.print(clarify("w"));

      try {
         Thread.sleep(500L);
      } catch (Exception var4) {
      }

      System.out.print(clarify("w"));

      try {
         Thread.sleep(500L);
      } catch (Exception var3) {
      }

      System.out.println(clarify("w"));

      try {
         Thread.sleep(500L);
      } catch (Exception var2) {
      }

      System.out.print(clarify("=R_^NYaXiMYWZVO^Owi1YYNLcOj"));
      System.exit(0);
   }

   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var2 = this.gateSize / 2;
      Font var3 = new Font(clarify("+\\SKV"), 1, this.fontSize);
      var1.setFont(var3);
      FontMetrics var4 = var1.getFontMetrics(var3);

      int var6;
      for(var6 = 0; var6 < this.gates.length; ++var6) {
         if (this.gates[var6][2] == 8) {
            if (this.checking) {
               if (this.powered[var6]) {
                  var1.setColor(this.outputLitColor);
                  var1.fillOval(this.gates[var6][0], this.gates[var6][1], this.gateSize, this.gateSize);
                  var1.setColor(Color.BLACK);
                  var1.drawOval(this.gates[var6][0], this.gates[var6][1], this.gateSize, this.gateSize);
               } else {
                  var1.setColor(Color.BLACK);
                  var1.fillOval(this.gates[var6][0], this.gates[var6][1], this.gateSize, this.gateSize);
                  var1.setColor(Color.WHITE);
               }
            } else {
               var1.setColor(Color.BLACK);
            }

            String var5 = clarify("") + (char)(80 + var6);
            var1.drawString(var5, this.gates[var6][0] + var2 - var4.stringWidth(var5) / 2, this.gates[var6][1] + (this.gateSize + this.fontSize * 4 / 5) / 2);
         } else {
            this.drawGate(var1, this.gates[var6][0], this.gates[var6][1], this.gates[var6][2]);
         }
      }

      if (this.powered[this.outputBackref]) {
         var1.setColor(this.outputLitColor);
      } else {
         var1.setColor(this.outputBoxColor);
      }

      var1.fillRect(this.outputCoords[0], this.outputCoords[1], this.outputSize, this.outputSize);
      if (this.powered[this.outputBackref]) {
         var1.setColor(Color.BLACK);
      } else {
         var1.setColor(Color.WHITE);
      }

      var1.drawString(clarify("9?>:?>"), this.outputCoords[0] + (this.outputSize - var4.stringWidth(clarify("9?>:?>"))) / 2, this.outputCoords[1] + (this.outputSize + this.fontSize) / 2);
      var1.setColor(Color.BLACK);
      int var10 = 0;

      int var11;
      for(var11 = 0; var11 < this.connections.length; ++var11) {
         for(int var12 = 0; var12 < this.connections[var11].length; var12 += 2) {
            var6 = this.gates[var11][0] + this.gateSize;
            int var8 = this.gates[var11][1] + var2;
            int var7;
            int var9;
            if (this.connections[var11][var12] > -1) {
               var7 = this.gates[this.connections[var11][var12]][0];
               var9 = this.gates[this.connections[var11][var12]][1] + var2 + this.inputSpacing * this.connections[var11][var12 + 1];
            } else {
               var7 = this.outputCoords[0];
               var9 = this.outputCoords[1] + this.outputSize / 2;
            }

            var1.setColor(this.wireColors[var10]);
            int var13 = (var6 + var7 * 4) / 5;
            var1.drawLine(var6, var8, var13, var8);
            var1.drawLine(var13, var8, var13, var9);
            var1.drawLine(var13, var9, var7, var9);
         }

         ++var10;
         var10 %= this.wireColors.length;
      }

      if (this.selected > -1) {
         var1.setColor(this.selectionColor);
         var1.drawRect(this.gates[this.selected][0] - 1, this.gates[this.selected][1] - 1, this.gateSize + 2, this.gateSize + 2);
         var1.drawRect(this.gates[this.selected][0] - 2, this.gates[this.selected][1] - 2, this.gateSize + 4, this.gateSize + 4);
      }

      for(var11 = 0; var11 < this.gateSelectors.length; ++var11) {
         this.drawGate(var1, this.gateSelectors[var11][0], this.gateSelectors[var11][1], var11);
      }

      var1.setColor(Color.BLACK);
      var1.drawString(clarify("1K^Oi=OVOM^Y\\$"), 10, this.gateSelectors[0][1] + this.fontSize);
      if (this.checking) {
         var1.setColor(Color.GRAY);
      } else {
         var1.setColor(Color.RED);
      }

      var1.fillRect(this.checkButtonX, this.checkButtonY, this.checkButtonW, this.checkButtonH);
      var1.setColor(Color.BLACK);
      var1.drawRect(this.checkButtonX, this.checkButtonY, this.checkButtonW, this.checkButtonH);
      var1.drawString(clarify("/B/-?>/"), this.checkButtonX + (this.checkButtonW - var4.stringWidth(clarify("/B/-?>/"))) / 2, this.checkButtonY + (this.checkButtonH + this.fontSize * 4 / 5) / 2);
      var1.drawRect(this.lockX, this.lockY, this.lockW, this.lockH);
      var1.drawArc(this.lockX + 20, this.lockY - 40, this.lockW - 40, 80, this.cracked ? 30 : 0, this.cracked ? 150 : 180);
      var1.drawArc(this.lockX + 30, this.lockY - 30, this.lockW - 60, 60, this.cracked ? 30 : 0, this.cracked ? 150 : 180);
      if (this.errorTimer > 0) {
         var1.setColor(new Color(0, 0, 0, 64));
         var1.fillRect(0, 0, this.screenWidth, this.screenHeight);
         var1.setColor(new Color(255, 0, 0));
         var1.setFont(new Font(clarify("+\\SKV"), 0, 200));
         var1.drawString(clarify("/<<9<"), 50, 350);
      }

   }

   public void drawGate(Graphics var1, int var2, int var3, int var4) {
      var1.setColor(this.borderColor);
      var1.drawRect(var2, var3, this.gateSize, this.gateSize);
      var1.setColor(this.gateColors[var4]);
      switch (var4) {
         case 1:
            var1.fillPolygon(new int[]{var2 + 1, var2 + 1, var2 + this.gateSize - 2}, new int[]{var3 + 1, var3 + this.gateSize - 2, var3 + this.gateSize / 2}, 3);
            break;
         default:
            var1.fillRect(var2 + 1, var3 + 1, this.gateSize - 2, this.gateSize - 2);
      }

   }

   public void mainLoop() {
      long var1 = System.currentTimeMillis();
      int var3 = -1;
      int var4 = 1;

      for(int var5 = 0; var5 < this.numInputs; ++var5) {
         var4 *= 2;
      }

      boolean var11 = true;

      while(this.go) {
         if (this.errorTimer > 0) {
            --this.errorTimer;
         } else if (this.checking) {
            ++var3;
            int var6;
            if (var3 < var4) {
               for(var6 = 0; var6 < this.numInputs; ++var6) {
                  this.powered[var6] = (var3 >> var6 & 1) > 0;
               }

               var6 = this.numInputs;

               while(true) {
                  if (var6 >= this.gates.length) {
                     if (this.powered[this.outputBackref] != this.targetOutput[this.lockID][var3]) {
                        var11 = false;
                     }
                     break;
                  }

                  switch (this.gates[var6][2]) {
                     case 0:
                        this.powered[var6] = this.powered[this.backrefs[var6][0]];
                        break;
                     case 1:
                        this.powered[var6] = !this.powered[this.backrefs[var6][0]];
                        break;
                     case 2:
                        this.powered[var6] = this.powered[this.backrefs[var6][0]] && this.powered[this.backrefs[var6][1]];
                        break;
                     case 3:
                        this.powered[var6] = this.powered[this.backrefs[var6][0]] || this.powered[this.backrefs[var6][1]];
                        break;
                     case 4:
                        this.powered[var6] = this.powered[this.backrefs[var6][0]] && !this.powered[this.backrefs[var6][1]] || !this.powered[this.backrefs[var6][0]] && this.powered[this.backrefs[var6][1]];
                        break;
                     case 5:
                        this.powered[var6] = !this.powered[this.backrefs[var6][0]] || !this.powered[this.backrefs[var6][1]];
                        break;
                     case 6:
                        this.powered[var6] = !this.powered[this.backrefs[var6][0]] && !this.powered[this.backrefs[var6][1]];
                        break;
                     case 7:
                        this.powered[var6] = this.powered[this.backrefs[var6][0]] && this.powered[this.backrefs[var6][1]] || !this.powered[this.backrefs[var6][0]] && !this.powered[this.backrefs[var6][1]];
                  }

                  ++var6;
               }
            } else {
               if (var11) {
                  this.cracked = true;
                  System.out.println(this.info[this.lockID]);
                  this.repaint();

                  try {
                     Thread.sleep(2000L);
                  } catch (Exception var10) {
                  }

                  System.exit(0);
               }

               var3 = -1;
               this.checking = false;

               for(var6 = 0; var6 < this.gates.length; ++var6) {
                  this.powered[var6] = false;
               }

               var11 = true;
            }
         }

         var1 += 1000L;
         this.repaint();
         long var12 = System.currentTimeMillis();
         if (var12 < var1) {
            try {
               Thread.sleep(var1 - var12);
            } catch (Exception var9) {
               var9.printStackTrace();
            }
         }
      }

      System.exit(0);
   }

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
      if (!this.checking) {
         int var2 = var1.getX();
         int var3 = var1.getY();
         boolean var4 = false;

         int var5;
         for(var5 = 0; var5 < this.gates.length; ++var5) {
            if (this.gates[var5][2] < 8 && var2 >= this.gates[var5][0] && var3 >= this.gates[var5][1] && var2 < this.gates[var5][0] + this.gateSize && var3 < this.gates[var5][1] + this.gateSize) {
               this.selected = var5;
               var4 = true;
               break;
            }
         }

         if (!var4 && var2 >= this.checkButtonX && var2 < this.checkButtonX + this.checkButtonW && var3 >= this.checkButtonY && var3 < this.checkButtonY + this.checkButtonH) {
            var4 = true;
            this.selected = -1;
            boolean var7 = true;

            for(int var6 = this.numInputs; var6 < this.gates.length; ++var6) {
               if (this.gates[var6][2] < 2 && this.backrefs[var6].length > 1 || this.gates[var6][2] >= 2 && this.backrefs[var6].length < 2) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               this.checking = true;
            } else {
               this.errorTimer = 2;
            }
         }

         if (!var4 && this.selected > -1) {
            if (var3 >= this.gateSelectors[0][1] && var3 < this.gateSelectors[0][1] + this.gateSize) {
               var5 = (var2 - this.gateSelectors[0][0]) / this.gateSize;
               if (var5 > -1 && var5 < 8) {
                  this.gates[this.selected][2] = var5;
                  var4 = true;
               }
            }

            if (!var4) {
               this.selected = -1;
            }
         }

         this.repaint();
      }

   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public static void main(String[] var0) {
      short var1 = 800;
      short var2 = 600;
      JFrame var3 = new JFrame();
      var3.setSize(var1, var2);
      var3.setDefaultCloseOperation(3);
      if (var0.length > 0) {
         GateMaster3000 var4 = new GateMaster3000(var0[0], var1, var2);
         var3.add(var4);
         var3.setVisible(true);
         var4.mainLoop();
      } else {
         System.out.println(clarify("/\\\\Y\\$i7S]]SXQiSXZ_^iPSVOiXKWO"));
      }

   }

   public static String clarify(String var0) {
      String var1 = "";

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var2 = decryptChar(var0.charAt(var3), 22);
         var1 = var1 + var2;
      }

      return var1;
   }

   public static char decryptChar(int var0, int var1) {
      char var2 = (char)var0;
      if (var2 > 31 && var2 < 127) {
         for(var2 = (char)(var2 + var1); var2 < ' '; var2 = (char)(var2 + 95)) {
         }

         while(var2 > '~') {
            var2 = (char)(var2 - 95);
         }
      }

      return var2;
   }
}
