/*     */ package fr.koora.jumpconquest.manager;
/*     */ 
/*     */ import fr.koora.jumpconquest.Main;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ 
/*     */ public class EventManager
/*     */ {
/*     */   private Main main;
/*     */   
/*     */   public EventManager(Main main)
/*     */   {
/*  18 */     this.main = main;
/*     */   }
/*     */   
/*     */   public void spawnEvent() {
/*  22 */     this.main.isSpawn = true;
/*  23 */     Bukkit.getWorld(this.main.world).getBlockAt(this.main.x, this.main.y, this.main.z).setType(this.main.mat);
/*  24 */     setupJump();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setupJump()
/*     */   {
/*  34 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 649).setType(this.main.mat1);
/*  35 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 66, 652).setType(this.main.mat1);
/*  36 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 649).setType(this.main.mat1);
/*  37 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 66, 646).setType(this.main.mat1);
/*     */     
/*     */ 
/*  40 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 649).setType(this.main.mat1);
/*  41 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 68, 643).setType(this.main.mat1);
/*  42 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 649).setType(this.main.mat1);
/*  43 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 68, 655).setType(this.main.mat1);
/*     */     
/*  45 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 67, 652).setType(this.main.mat1);
/*  46 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 67, 646).setType(this.main.mat1);
/*  47 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 67, 646).setType(this.main.mat1);
/*  48 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 67, 652).setType(this.main.mat1);
/*     */     
/*  50 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 69, 645).setType(this.main.mat1);
/*  51 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 643).setType(this.main.mat1);
/*  52 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 643).setType(this.main.mat1);
/*  53 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 69, 645).setType(this.main.mat1);
/*  54 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 69, 653).setType(this.main.mat1);
/*  55 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 655).setType(this.main.mat1);
/*  56 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 655).setType(this.main.mat1);
/*  57 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 69, 653).setType(this.main.mat1);
/*     */     
/*  59 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 70, 645).setType(this.main.mat1);
/*  60 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 70, 653).setType(this.main.mat1);
/*  61 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 70, 653).setType(this.main.mat1);
/*  62 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 70, 645).setType(this.main.mat1);
/*     */     
/*  64 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 71, 648).setType(this.main.mat1);
/*  65 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 71, 648).setType(this.main.mat1);
/*  66 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 71, 650).setType(this.main.mat1);
/*  67 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 71, 650).setType(this.main.mat1);
/*     */     
/*  69 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 644).setType(this.main.mat1);
/*  70 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 72, 649).setType(this.main.mat1);
/*  71 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 654).setType(this.main.mat1);
/*  72 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 72, 649).setType(this.main.mat1);
/*     */     
/*  74 */     Bukkit.getWorld(this.main.world).getBlockAt(1619, 73, 649).setType(this.main.mat1);
/*  75 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 73, 641).setType(this.main.mat1);
/*  76 */     Bukkit.getWorld(this.main.world).getBlockAt(1635, 73, 649).setType(this.main.mat1);
/*  77 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 73, 657).setType(this.main.mat1);
/*     */     
/*  79 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 74, 655).setType(this.main.mat1);
/*  80 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 74, 655).setType(this.main.mat1);
/*  81 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 651).setType(this.main.mat1);
/*  82 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 647).setType(this.main.mat1);
/*  83 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 74, 643).setType(this.main.mat1);
/*  84 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 74, 643).setType(this.main.mat1);
/*  85 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 647).setType(this.main.mat1);
/*  86 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 651).setType(this.main.mat1);
/*     */     
/*  88 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 655).setType(this.main.mat1);
/*  89 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 75, 655).setType(this.main.mat1);
/*  90 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 75, 653).setType(this.main.mat1);
/*  91 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 75, 645).setType(this.main.mat1);
/*  92 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 75, 643).setType(this.main.mat1);
/*  93 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 643).setType(this.main.mat1);
/*  94 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 75, 645).setType(this.main.mat1);
/*  95 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 653).setType(this.main.mat1);
/*     */     
/*  97 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 76, 654).setType(this.main.mat1);
/*  98 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 76, 650).setType(this.main.mat1);
/*  99 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 76, 648).setType(this.main.mat1);
/* 100 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 76, 644).setType(this.main.mat1);
/* 101 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 76, 644).setType(this.main.mat1);
/* 102 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 76, 648).setType(this.main.mat1);
/* 103 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 76, 650).setType(this.main.mat1);
/* 104 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 76, 654).setType(this.main.mat1);
/*     */     
/* 106 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 653).setType(this.main.mat1);
/* 107 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 77, 649).setType(this.main.mat1);
/* 108 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 645).setType(this.main.mat1);
/* 109 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 77, 649).setType(this.main.mat1);
/*     */     
/* 111 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 649).setType(this.main.mat1);
/* 112 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 78, 652).setType(this.main.mat1);
/* 113 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 649).setType(this.main.mat1);
/* 114 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 78, 646).setType(this.main.mat1);
/*     */     
/* 116 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 79, 646).setType(this.main.mat1);
/* 117 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 79, 652).setType(this.main.mat1);
/* 118 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 79, 652).setType(this.main.mat1);
/* 119 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 79, 646).setType(this.main.mat1);
/*     */     
/* 121 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 648).setType(this.main.mat1);
/* 122 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 648).setType(this.main.mat1);
/* 123 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 650).setType(this.main.mat1);
/* 124 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 650).setType(this.main.mat1);
/*     */     
/* 126 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 650).setType(this.main.mat1);
/* 127 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 81, 649).setType(this.main.mat1);
/* 128 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 648).setType(this.main.mat1);
/* 129 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 81, 649).setType(this.main.mat1);
/*     */     
/* 131 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 82, 649).setType(this.main.mat1);
/*     */     
/* 133 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 646).setType(this.main.mat1);
/* 134 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 652).setType(this.main.mat1);
/* 135 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 652).setType(this.main.mat1);
/* 136 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 646).setType(this.main.mat1);
/*     */     
/* 138 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 84, 646).setType(this.main.mat1);
/* 139 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 84, 649).setType(this.main.mat1);
/* 140 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 84, 652).setType(this.main.mat1);
/* 141 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 84, 649).setType(this.main.mat1);
/*     */     
/* 143 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 89, 645).setType(this.main.mat1);
/* 144 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 89, 645).setType(this.main.mat1);
/* 145 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 89, 653).setType(this.main.mat1);
/* 146 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 89, 653).setType(this.main.mat1);
/*     */     
/* 148 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 90, 650).setType(this.main.mat1);
/* 149 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 90, 654).setType(this.main.mat1);
/* 150 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 90, 654).setType(this.main.mat1);
/* 151 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 90, 650).setType(this.main.mat1);
/* 152 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 90, 648).setType(this.main.mat1);
/* 153 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 90, 644).setType(this.main.mat1);
/* 154 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 90, 644).setType(this.main.mat1);
/* 155 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 90, 648).setType(this.main.mat1);
/*     */     
/* 157 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 91, 649).setType(this.main.mat1);
/* 158 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 647).setType(this.main.mat1);
/* 159 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 91, 649).setType(this.main.mat1);
/* 160 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 651).setType(this.main.mat1);
/*     */     
/* 162 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 92, 649).setType(this.main.mat1);
/*     */     
/* 164 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 93, 647).setType(this.main.mat1);
/* 165 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 93, 647).setType(this.main.mat1);
/* 166 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 93, 651).setType(this.main.mat1);
/* 167 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 93, 651).setType(this.main.mat1);
/*     */     
/* 169 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 94, 650).setType(this.main.mat1);
/* 170 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 94, 648).setType(this.main.mat1);
/* 171 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 94, 646).setType(this.main.mat1);
/* 172 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 94, 646).setType(this.main.mat1);
/* 173 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 94, 648).setType(this.main.mat1);
/* 174 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 94, 650).setType(this.main.mat1);
/* 175 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 94, 652).setType(this.main.mat1);
/* 176 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 94, 652).setType(this.main.mat1);
/*     */     
/* 178 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 95, 649).setType(this.main.mat1);
/* 179 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 95, 644).setType(this.main.mat1);
/* 180 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 95, 649).setType(this.main.mat1);
/* 181 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 95, 654).setType(this.main.mat1);
/*     */     
/* 183 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 96, 652).setType(this.main.mat1);
/* 184 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 96, 652).setType(this.main.mat1);
/* 185 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 96, 646).setType(this.main.mat1);
/* 186 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 96, 646).setType(this.main.mat1);
/*     */     
/* 188 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 97, 654).setType(this.main.mat1);
/* 189 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 97, 654).setType(this.main.mat1);
/* 190 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 97, 644).setType(this.main.mat1);
/* 191 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 97, 644).setType(this.main.mat1);
/*     */     
/* 193 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 98, 647).setType(this.main.mat1);
/* 194 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 98, 651).setType(this.main.mat1);
/* 195 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 98, 655).setType(this.main.mat1);
/* 196 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 98, 655).setType(this.main.mat1);
/* 197 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 98, 651).setType(this.main.mat1);
/* 198 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 98, 647).setType(this.main.mat1);
/* 199 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 98, 643).setType(this.main.mat1);
/* 200 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 98, 643).setType(this.main.mat1);
/*     */     
/* 202 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 99, 645).setType(this.main.jumpblock);
/* 203 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 99, 649).setType(this.main.jumpblock);
/* 204 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 99, 653).setType(this.main.jumpblock);
/* 205 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 99, 649).setType(this.main.jumpblock);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 65, 649).setType(this.main.mat2);
/* 216 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 65, 652).setType(this.main.mat2);
/* 217 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 65, 649).setType(this.main.mat2);
/* 218 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 65, 646).setType(this.main.mat2);
/*     */     
/* 220 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 67, 649).setType(this.main.mat2);
/* 221 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 67, 643).setType(this.main.mat2);
/* 222 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 67, 649).setType(this.main.mat2);
/* 223 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 67, 655).setType(this.main.mat2);
/*     */     
/* 225 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 652).setType(this.main.mat2);
/* 226 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 646).setType(this.main.mat2);
/* 227 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 646).setType(this.main.mat2);
/* 228 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 652).setType(this.main.mat2);
/*     */     
/* 230 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 645).setType(this.main.mat2);
/* 231 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 68, 643).setType(this.main.mat2);
/* 232 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 68, 643).setType(this.main.mat2);
/* 233 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 645).setType(this.main.mat2);
/* 234 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 653).setType(this.main.mat2);
/* 235 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 68, 655).setType(this.main.mat2);
/* 236 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 68, 655).setType(this.main.mat2);
/* 237 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 653).setType(this.main.mat2);
/*     */     
/* 239 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 645).setType(this.main.mat2);
/* 240 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 653).setType(this.main.mat2);
/* 241 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 653).setType(this.main.mat2);
/* 242 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 645).setType(this.main.mat2);
/*     */     
/* 244 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 70, 648).setType(this.main.mat2);
/* 245 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 70, 648).setType(this.main.mat2);
/* 246 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 70, 650).setType(this.main.mat2);
/* 247 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 70, 650).setType(this.main.mat2);
/*     */     
/* 249 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 71, 644).setType(this.main.mat2);
/* 250 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 71, 649).setType(this.main.mat2);
/* 251 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 71, 654).setType(this.main.mat2);
/* 252 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 71, 649).setType(this.main.mat2);
/*     */     
/* 254 */     Bukkit.getWorld(this.main.world).getBlockAt(1619, 72, 649).setType(this.main.mat2);
/* 255 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 641).setType(this.main.mat2);
/* 256 */     Bukkit.getWorld(this.main.world).getBlockAt(1635, 72, 649).setType(this.main.mat2);
/* 257 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 657).setType(this.main.mat2);
/*     */     
/* 259 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 73, 655).setType(this.main.mat2);
/* 260 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 73, 655).setType(this.main.mat2);
/* 261 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 73, 651).setType(this.main.mat2);
/* 262 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 73, 647).setType(this.main.mat2);
/* 263 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 73, 643).setType(this.main.mat2);
/* 264 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 73, 643).setType(this.main.mat2);
/* 265 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 73, 647).setType(this.main.mat2);
/* 266 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 73, 651).setType(this.main.mat2);
/*     */     
/* 268 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 655).setType(this.main.mat2);
/* 269 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 74, 655).setType(this.main.mat2);
/* 270 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 653).setType(this.main.mat2);
/* 271 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 645).setType(this.main.mat2);
/* 272 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 74, 643).setType(this.main.mat2);
/* 273 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 643).setType(this.main.mat2);
/* 274 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 645).setType(this.main.mat2);
/* 275 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 653).setType(this.main.mat2);
/*     */     
/* 277 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 75, 654).setType(this.main.mat2);
/* 278 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 75, 650).setType(this.main.mat2);
/* 279 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 75, 648).setType(this.main.mat2);
/* 280 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 75, 644).setType(this.main.mat2);
/* 281 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 75, 644).setType(this.main.mat2);
/* 282 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 75, 648).setType(this.main.mat2);
/* 283 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 75, 650).setType(this.main.mat2);
/* 284 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 75, 654).setType(this.main.mat2);
/*     */     
/* 286 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 76, 653).setType(this.main.mat2);
/* 287 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 76, 649).setType(this.main.mat2);
/* 288 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 76, 645).setType(this.main.mat2);
/* 289 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 76, 649).setType(this.main.mat2);
/*     */     
/* 291 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 77, 649).setType(this.main.mat2);
/* 292 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 652).setType(this.main.mat2);
/* 293 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 77, 649).setType(this.main.mat2);
/* 294 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 646).setType(this.main.mat2);
/*     */     
/* 296 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 646).setType(this.main.mat2);
/* 297 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 652).setType(this.main.mat2);
/* 298 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 652).setType(this.main.mat2);
/* 299 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 646).setType(this.main.mat2);
/*     */     
/* 301 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 79, 648).setType(this.main.mat2);
/* 302 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 79, 648).setType(this.main.mat2);
/* 303 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 79, 650).setType(this.main.mat2);
/* 304 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 79, 650).setType(this.main.mat2);
/*     */     
/* 306 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 80, 650).setType(this.main.mat2);
/* 307 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 649).setType(this.main.mat2);
/* 308 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 80, 648).setType(this.main.mat2);
/* 309 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 649).setType(this.main.mat2);
/*     */     
/* 311 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 649).setType(this.main.mat2);
/*     */     
/* 313 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 82, 646).setType(this.main.mat2);
/* 314 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 82, 652).setType(this.main.mat2);
/* 315 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 82, 652).setType(this.main.mat2);
/* 316 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 82, 646).setType(this.main.mat2);
/*     */     
/* 318 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 83, 646).setType(this.main.mat2);
/* 319 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 649).setType(this.main.mat2);
/* 320 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 83, 652).setType(this.main.mat2);
/* 321 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 649).setType(this.main.mat2);
/*     */     
/* 323 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 88, 645).setType(this.main.mat2);
/* 324 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 88, 645).setType(this.main.mat2);
/* 325 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 88, 653).setType(this.main.mat2);
/* 326 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 88, 653).setType(this.main.mat2);
/*     */     
/* 328 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 89, 650).setType(this.main.mat2);
/* 329 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 89, 654).setType(this.main.mat2);
/* 330 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 89, 654).setType(this.main.mat2);
/* 331 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 89, 650).setType(this.main.mat2);
/* 332 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 89, 648).setType(this.main.mat2);
/* 333 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 89, 644).setType(this.main.mat2);
/* 334 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 89, 644).setType(this.main.mat2);
/* 335 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 89, 648).setType(this.main.mat2);
/*     */     
/* 337 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 90, 649).setType(this.main.mat2);
/* 338 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 90, 647).setType(this.main.mat2);
/* 339 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 90, 649).setType(this.main.mat2);
/* 340 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 90, 651).setType(this.main.mat2);
/*     */     
/* 342 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 649).setType(this.main.mat2);
/*     */     
/* 344 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 92, 647).setType(this.main.mat2);
/* 345 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 92, 647).setType(this.main.mat2);
/* 346 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 92, 651).setType(this.main.mat2);
/* 347 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 92, 651).setType(this.main.mat2);
/*     */     
/* 349 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 93, 650).setType(this.main.mat2);
/* 350 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 93, 648).setType(this.main.mat2);
/* 351 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 93, 646).setType(this.main.mat2);
/* 352 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 93, 646).setType(this.main.mat2);
/* 353 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 93, 648).setType(this.main.mat2);
/* 354 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 93, 650).setType(this.main.mat2);
/* 355 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 93, 652).setType(this.main.mat2);
/* 356 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 93, 652).setType(this.main.mat2);
/*     */     
/* 358 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 94, 649).setType(this.main.mat2);
/* 359 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 94, 644).setType(this.main.mat2);
/* 360 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 94, 649).setType(this.main.mat2);
/* 361 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 94, 654).setType(this.main.mat2);
/*     */     
/* 363 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 95, 652).setType(this.main.mat2);
/* 364 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 95, 652).setType(this.main.mat2);
/* 365 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 95, 646).setType(this.main.mat2);
/* 366 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 95, 646).setType(this.main.mat2);
/*     */     
/* 368 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 96, 654).setType(this.main.mat2);
/* 369 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 96, 654).setType(this.main.mat2);
/* 370 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 96, 644).setType(this.main.mat2);
/* 371 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 96, 644).setType(this.main.mat2);
/*     */     
/* 373 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 97, 647).setType(this.main.mat2);
/* 374 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 97, 651).setType(this.main.mat2);
/* 375 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 97, 655).setType(this.main.mat2);
/* 376 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 97, 655).setType(this.main.mat2);
/* 377 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 97, 651).setType(this.main.mat2);
/* 378 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 97, 647).setType(this.main.mat2);
/* 379 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 97, 643).setType(this.main.mat2);
/* 380 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 97, 643).setType(this.main.mat2);
/*     */     
/* 382 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 98, 645).setType(this.main.mat2);
/* 383 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 98, 649).setType(this.main.mat2);
/* 384 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 98, 653).setType(this.main.mat2);
/* 385 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 98, 649).setType(this.main.mat2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void killJump()
/*     */   {
/* 393 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 649).setType(this.main.matafter);
/* 394 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 66, 652).setType(this.main.matafter);
/* 395 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 649).setType(this.main.matafter);
/* 396 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 66, 646).setType(this.main.matafter);
/*     */     
/*     */ 
/* 399 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 649).setType(this.main.matafter);
/* 400 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 68, 643).setType(this.main.matafter);
/* 401 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 649).setType(this.main.matafter);
/* 402 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 68, 655).setType(this.main.matafter);
/*     */     
/* 404 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 67, 652).setType(this.main.matafter);
/* 405 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 67, 646).setType(this.main.matafter);
/* 406 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 67, 646).setType(this.main.matafter);
/* 407 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 67, 652).setType(this.main.matafter);
/*     */     
/* 409 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 69, 645).setType(this.main.matafter);
/* 410 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 643).setType(this.main.matafter);
/* 411 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 643).setType(this.main.matafter);
/* 412 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 69, 645).setType(this.main.matafter);
/* 413 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 69, 653).setType(this.main.matafter);
/* 414 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 655).setType(this.main.matafter);
/* 415 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 655).setType(this.main.matafter);
/* 416 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 69, 653).setType(this.main.matafter);
/*     */     
/* 418 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 70, 645).setType(this.main.matafter);
/* 419 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 70, 653).setType(this.main.matafter);
/* 420 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 70, 653).setType(this.main.matafter);
/* 421 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 70, 645).setType(this.main.matafter);
/*     */     
/* 423 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 71, 648).setType(this.main.matafter);
/* 424 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 71, 648).setType(this.main.matafter);
/* 425 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 71, 650).setType(this.main.matafter);
/* 426 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 71, 650).setType(this.main.matafter);
/*     */     
/* 428 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 644).setType(this.main.matafter);
/* 429 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 72, 649).setType(this.main.matafter);
/* 430 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 654).setType(this.main.matafter);
/* 431 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 72, 649).setType(this.main.matafter);
/*     */     
/* 433 */     Bukkit.getWorld(this.main.world).getBlockAt(1619, 73, 649).setType(this.main.matafter);
/* 434 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 73, 641).setType(this.main.matafter);
/* 435 */     Bukkit.getWorld(this.main.world).getBlockAt(1635, 73, 649).setType(this.main.matafter);
/* 436 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 73, 657).setType(this.main.matafter);
/*     */     
/* 438 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 74, 655).setType(this.main.matafter);
/* 439 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 74, 655).setType(this.main.matafter);
/* 440 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 651).setType(this.main.matafter);
/* 441 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 647).setType(this.main.matafter);
/* 442 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 74, 643).setType(this.main.matafter);
/* 443 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 74, 643).setType(this.main.matafter);
/* 444 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 647).setType(this.main.matafter);
/* 445 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 651).setType(this.main.matafter);
/*     */     
/* 447 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 655).setType(this.main.matafter);
/* 448 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 75, 655).setType(this.main.matafter);
/* 449 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 75, 653).setType(this.main.matafter);
/* 450 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 75, 645).setType(this.main.matafter);
/* 451 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 75, 643).setType(this.main.matafter);
/* 452 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 643).setType(this.main.matafter);
/* 453 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 75, 645).setType(this.main.matafter);
/* 454 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 75, 653).setType(this.main.matafter);
/*     */     
/* 456 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 76, 654).setType(this.main.matafter);
/* 457 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 76, 650).setType(this.main.matafter);
/* 458 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 76, 648).setType(this.main.matafter);
/* 459 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 76, 644).setType(this.main.matafter);
/* 460 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 76, 644).setType(this.main.matafter);
/* 461 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 76, 648).setType(this.main.matafter);
/* 462 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 76, 650).setType(this.main.matafter);
/* 463 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 76, 654).setType(this.main.matafter);
/*     */     
/* 465 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 653).setType(this.main.matafter);
/* 466 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 77, 649).setType(this.main.matafter);
/* 467 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 645).setType(this.main.matafter);
/* 468 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 77, 649).setType(this.main.matafter);
/*     */     
/* 470 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 649).setType(this.main.matafter);
/* 471 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 78, 652).setType(this.main.matafter);
/* 472 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 649).setType(this.main.matafter);
/* 473 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 78, 646).setType(this.main.matafter);
/*     */     
/* 475 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 79, 646).setType(this.main.matafter);
/* 476 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 79, 652).setType(this.main.matafter);
/* 477 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 79, 652).setType(this.main.matafter);
/* 478 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 79, 646).setType(this.main.matafter);
/*     */     
/* 480 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 648).setType(this.main.matafter);
/* 481 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 648).setType(this.main.matafter);
/* 482 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 650).setType(this.main.matafter);
/* 483 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 650).setType(this.main.matafter);
/*     */     
/* 485 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 650).setType(this.main.matafter);
/* 486 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 81, 649).setType(this.main.matafter);
/* 487 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 648).setType(this.main.matafter);
/* 488 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 81, 649).setType(this.main.matafter);
/*     */     
/* 490 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 82, 649).setType(this.main.matafter);
/*     */     
/* 492 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 646).setType(this.main.matafter);
/* 493 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 652).setType(this.main.matafter);
/* 494 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 652).setType(this.main.matafter);
/* 495 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 646).setType(this.main.matafter);
/*     */     
/* 497 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 84, 646).setType(this.main.matafter);
/* 498 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 84, 649).setType(this.main.matafter);
/* 499 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 84, 652).setType(this.main.matafter);
/* 500 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 84, 649).setType(this.main.matafter);
/*     */     
/* 502 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 89, 645).setType(this.main.matafter);
/* 503 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 89, 645).setType(this.main.matafter);
/* 504 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 89, 653).setType(this.main.matafter);
/* 505 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 89, 653).setType(this.main.matafter);
/*     */     
/* 507 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 90, 650).setType(this.main.matafter);
/* 508 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 90, 654).setType(this.main.matafter);
/* 509 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 90, 654).setType(this.main.matafter);
/* 510 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 90, 650).setType(this.main.matafter);
/* 511 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 90, 648).setType(this.main.matafter);
/* 512 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 90, 644).setType(this.main.matafter);
/* 513 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 90, 644).setType(this.main.matafter);
/* 514 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 90, 648).setType(this.main.matafter);
/*     */     
/* 516 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 91, 649).setType(this.main.matafter);
/* 517 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 647).setType(this.main.matafter);
/* 518 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 91, 649).setType(this.main.matafter);
/* 519 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 651).setType(this.main.matafter);
/*     */     
/* 521 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 92, 649).setType(this.main.matafter);
/*     */     
/* 523 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 93, 647).setType(this.main.matafter);
/* 524 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 93, 647).setType(this.main.matafter);
/* 525 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 93, 651).setType(this.main.matafter);
/* 526 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 93, 651).setType(this.main.matafter);
/*     */     
/* 528 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 94, 650).setType(this.main.matafter);
/* 529 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 94, 648).setType(this.main.matafter);
/* 530 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 94, 646).setType(this.main.matafter);
/* 531 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 94, 646).setType(this.main.matafter);
/* 532 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 94, 648).setType(this.main.matafter);
/* 533 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 94, 650).setType(this.main.matafter);
/* 534 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 94, 652).setType(this.main.matafter);
/* 535 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 94, 652).setType(this.main.matafter);
/*     */     
/* 537 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 95, 649).setType(this.main.matafter);
/* 538 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 95, 644).setType(this.main.matafter);
/* 539 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 95, 649).setType(this.main.matafter);
/* 540 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 95, 654).setType(this.main.matafter);
/*     */     
/* 542 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 96, 652).setType(this.main.matafter);
/* 543 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 96, 652).setType(this.main.matafter);
/* 544 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 96, 646).setType(this.main.matafter);
/* 545 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 96, 646).setType(this.main.matafter);
/*     */     
/* 547 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 97, 654).setType(this.main.matafter);
/* 548 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 97, 654).setType(this.main.matafter);
/* 549 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 97, 644).setType(this.main.matafter);
/* 550 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 97, 644).setType(this.main.matafter);
/*     */     
/* 552 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 98, 647).setType(this.main.matafter);
/* 553 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 98, 651).setType(this.main.matafter);
/* 554 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 98, 655).setType(this.main.matafter);
/* 555 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 98, 655).setType(this.main.matafter);
/* 556 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 98, 651).setType(this.main.matafter);
/* 557 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 98, 647).setType(this.main.matafter);
/* 558 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 98, 643).setType(this.main.matafter);
/* 559 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 98, 643).setType(this.main.matafter);
/*     */     
/* 561 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 99, 645).setType(this.main.matafter);
/* 562 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 99, 649).setType(this.main.matafter);
/* 563 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 99, 653).setType(this.main.matafter);
/* 564 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 99, 649).setType(this.main.matafter);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 574 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 65, 649).setType(this.main.matafter);
/* 575 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 65, 652).setType(this.main.matafter);
/* 576 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 65, 649).setType(this.main.matafter);
/* 577 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 65, 646).setType(this.main.matafter);
/*     */     
/* 579 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 67, 649).setType(this.main.matafter);
/* 580 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 67, 643).setType(this.main.matafter);
/* 581 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 67, 649).setType(this.main.matafter);
/* 582 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 67, 655).setType(this.main.matafter);
/*     */     
/* 584 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 652).setType(this.main.matafter);
/* 585 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 66, 646).setType(this.main.matafter);
/* 586 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 646).setType(this.main.matafter);
/* 587 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 66, 652).setType(this.main.matafter);
/*     */     
/* 589 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 645).setType(this.main.matafter);
/* 590 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 68, 643).setType(this.main.matafter);
/* 591 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 68, 643).setType(this.main.matafter);
/* 592 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 645).setType(this.main.matafter);
/* 593 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 68, 653).setType(this.main.matafter);
/* 594 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 68, 655).setType(this.main.matafter);
/* 595 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 68, 655).setType(this.main.matafter);
/* 596 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 68, 653).setType(this.main.matafter);
/*     */     
/* 598 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 645).setType(this.main.matafter);
/* 599 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 69, 653).setType(this.main.matafter);
/* 600 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 653).setType(this.main.matafter);
/* 601 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 69, 645).setType(this.main.matafter);
/*     */     
/* 603 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 70, 648).setType(this.main.matafter);
/* 604 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 70, 648).setType(this.main.matafter);
/* 605 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 70, 650).setType(this.main.matafter);
/* 606 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 70, 650).setType(this.main.matafter);
/*     */     
/* 608 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 71, 644).setType(this.main.matafter);
/* 609 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 71, 649).setType(this.main.matafter);
/* 610 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 71, 654).setType(this.main.matafter);
/* 611 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 71, 649).setType(this.main.matafter);
/*     */     
/* 613 */     Bukkit.getWorld(this.main.world).getBlockAt(1619, 72, 649).setType(this.main.matafter);
/* 614 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 641).setType(this.main.matafter);
/* 615 */     Bukkit.getWorld(this.main.world).getBlockAt(1635, 72, 649).setType(this.main.matafter);
/* 616 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 72, 657).setType(this.main.matafter);
/*     */     
/* 618 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 73, 655).setType(this.main.matafter);
/* 619 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 73, 655).setType(this.main.matafter);
/* 620 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 73, 651).setType(this.main.matafter);
/* 621 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 73, 647).setType(this.main.matafter);
/* 622 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 73, 643).setType(this.main.matafter);
/* 623 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 73, 643).setType(this.main.matafter);
/* 624 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 73, 647).setType(this.main.matafter);
/* 625 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 73, 651).setType(this.main.matafter);
/*     */     
/* 627 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 655).setType(this.main.matafter);
/* 628 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 74, 655).setType(this.main.matafter);
/* 629 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 653).setType(this.main.matafter);
/* 630 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 74, 645).setType(this.main.matafter);
/* 631 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 74, 643).setType(this.main.matafter);
/* 632 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 643).setType(this.main.matafter);
/* 633 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 74, 645).setType(this.main.matafter);
/* 634 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 74, 653).setType(this.main.matafter);
/*     */     
/* 636 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 75, 654).setType(this.main.matafter);
/* 637 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 75, 650).setType(this.main.matafter);
/* 638 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 75, 648).setType(this.main.matafter);
/* 639 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 75, 644).setType(this.main.matafter);
/* 640 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 75, 644).setType(this.main.matafter);
/* 641 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 75, 648).setType(this.main.matafter);
/* 642 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 75, 650).setType(this.main.matafter);
/* 643 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 75, 654).setType(this.main.matafter);
/*     */     
/* 645 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 76, 653).setType(this.main.matafter);
/* 646 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 76, 649).setType(this.main.matafter);
/* 647 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 76, 645).setType(this.main.matafter);
/* 648 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 76, 649).setType(this.main.matafter);
/*     */     
/* 650 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 77, 649).setType(this.main.matafter);
/* 651 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 652).setType(this.main.matafter);
/* 652 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 77, 649).setType(this.main.matafter);
/* 653 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 77, 646).setType(this.main.matafter);
/*     */     
/* 655 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 646).setType(this.main.matafter);
/* 656 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 78, 652).setType(this.main.matafter);
/* 657 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 652).setType(this.main.matafter);
/* 658 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 78, 646).setType(this.main.matafter);
/*     */     
/* 660 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 79, 648).setType(this.main.matafter);
/* 661 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 79, 648).setType(this.main.matafter);
/* 662 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 79, 650).setType(this.main.matafter);
/* 663 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 79, 650).setType(this.main.matafter);
/*     */     
/* 665 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 80, 650).setType(this.main.matafter);
/* 666 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 80, 649).setType(this.main.matafter);
/* 667 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 80, 648).setType(this.main.matafter);
/* 668 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 80, 649).setType(this.main.matafter);
/*     */     
/* 670 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 81, 649).setType(this.main.matafter);
/*     */     
/* 672 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 82, 646).setType(this.main.matafter);
/* 673 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 82, 652).setType(this.main.matafter);
/* 674 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 82, 652).setType(this.main.matafter);
/* 675 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 82, 646).setType(this.main.matafter);
/*     */     
/* 677 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 83, 646).setType(this.main.matafter);
/* 678 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 83, 649).setType(this.main.matafter);
/* 679 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 83, 652).setType(this.main.matafter);
/* 680 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 83, 649).setType(this.main.matafter);
/*     */     
/* 682 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 88, 645).setType(this.main.matafter);
/* 683 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 88, 645).setType(this.main.matafter);
/* 684 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 88, 653).setType(this.main.matafter);
/* 685 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 88, 653).setType(this.main.matafter);
/*     */     
/* 687 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 89, 650).setType(this.main.matafter);
/* 688 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 89, 654).setType(this.main.matafter);
/* 689 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 89, 654).setType(this.main.matafter);
/* 690 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 89, 650).setType(this.main.matafter);
/* 691 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 89, 648).setType(this.main.matafter);
/* 692 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 89, 644).setType(this.main.matafter);
/* 693 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 89, 644).setType(this.main.matafter);
/* 694 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 89, 648).setType(this.main.matafter);
/*     */     
/* 696 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 90, 649).setType(this.main.matafter);
/* 697 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 90, 647).setType(this.main.matafter);
/* 698 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 90, 649).setType(this.main.matafter);
/* 699 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 90, 651).setType(this.main.matafter);
/*     */     
/* 701 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 91, 649).setType(this.main.matafter);
/*     */     
/* 703 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 92, 647).setType(this.main.matafter);
/* 704 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 92, 647).setType(this.main.matafter);
/* 705 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 92, 651).setType(this.main.matafter);
/* 706 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 92, 651).setType(this.main.matafter);
/*     */     
/* 708 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 93, 650).setType(this.main.matafter);
/* 709 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 93, 648).setType(this.main.matafter);
/* 710 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 93, 646).setType(this.main.matafter);
/* 711 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 93, 646).setType(this.main.matafter);
/* 712 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 93, 648).setType(this.main.matafter);
/* 713 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 93, 650).setType(this.main.matafter);
/* 714 */     Bukkit.getWorld(this.main.world).getBlockAt(1626, 93, 652).setType(this.main.matafter);
/* 715 */     Bukkit.getWorld(this.main.world).getBlockAt(1628, 93, 652).setType(this.main.matafter);
/*     */     
/* 717 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 94, 649).setType(this.main.matafter);
/* 718 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 94, 644).setType(this.main.matafter);
/* 719 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 94, 649).setType(this.main.matafter);
/* 720 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 94, 654).setType(this.main.matafter);
/*     */     
/* 722 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 95, 652).setType(this.main.matafter);
/* 723 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 95, 652).setType(this.main.matafter);
/* 724 */     Bukkit.getWorld(this.main.world).getBlockAt(1630, 95, 646).setType(this.main.matafter);
/* 725 */     Bukkit.getWorld(this.main.world).getBlockAt(1624, 95, 646).setType(this.main.matafter);
/*     */     
/* 727 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 96, 654).setType(this.main.matafter);
/* 728 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 96, 654).setType(this.main.matafter);
/* 729 */     Bukkit.getWorld(this.main.world).getBlockAt(1622, 96, 644).setType(this.main.matafter);
/* 730 */     Bukkit.getWorld(this.main.world).getBlockAt(1632, 96, 644).setType(this.main.matafter);
/*     */     
/* 732 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 97, 647).setType(this.main.matafter);
/* 733 */     Bukkit.getWorld(this.main.world).getBlockAt(1633, 97, 651).setType(this.main.matafter);
/* 734 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 97, 655).setType(this.main.matafter);
/* 735 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 97, 655).setType(this.main.matafter);
/* 736 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 97, 651).setType(this.main.matafter);
/* 737 */     Bukkit.getWorld(this.main.world).getBlockAt(1621, 97, 647).setType(this.main.matafter);
/* 738 */     Bukkit.getWorld(this.main.world).getBlockAt(1625, 97, 643).setType(this.main.matafter);
/* 739 */     Bukkit.getWorld(this.main.world).getBlockAt(1629, 97, 643).setType(this.main.matafter);
/*     */     
/* 741 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 98, 645).setType(this.main.matafter);
/* 742 */     Bukkit.getWorld(this.main.world).getBlockAt(1623, 98, 649).setType(this.main.matafter);
/* 743 */     Bukkit.getWorld(this.main.world).getBlockAt(1627, 98, 653).setType(this.main.matafter);
/* 744 */     Bukkit.getWorld(this.main.world).getBlockAt(1631, 98, 649).setType(this.main.matafter);
/*     */   }
/*     */   
/*     */   public void killEvent()
/*     */   {
/* 749 */     this.main.isSpawn = false;
/* 750 */     this.main.brokeblock = 0;
/* 751 */     Bukkit.getWorld(this.main.world).getBlockAt(this.main.x, this.main.y, this.main.z).setType(this.main.matafter);
/* 752 */     killJump();
/*     */   }
/*     */   
/*     */   public void giveRecomp(Player p) {
/* 756 */     int count = 0;
/* 757 */     for (ItemStack i : p.getInventory()) {
/* 758 */       if (i == null) {
/* 759 */         count++;
/*     */       }
/*     */     }
/*     */     
/* 763 */     if (count < 5) {
/* 764 */       p.sendMessage(org.bukkit.ChatColor.RED + "Vous devez avoir au minimum 5 slots de vide pour reçevoir votre récompense !");
/* 765 */       return;
/*     */     }
/*     */     
/* 768 */     p.sendMessage(org.bukkit.ChatColor.GREEN + "Vous allez reçevoir votre récompense !");
/* 769 */     this.main.getConfig().set(p.getName() + ".loot", Boolean.valueOf(false));
/* 770 */     this.main.saveConfig();
/* 771 */     giveKit(p);
/*     */   }
/*     */   
/*     */   public void giveKit(Player p) {
/* 775 */     int countt = 0;
/* 776 */     java.util.Random rand = new java.util.Random();
/* 777 */     countt = rand.nextInt(2) + 1;
/*     */     
/* 779 */     ItemStack itemstackq = new ItemStack(Material.GOLDEN_APPLE, 1);
/* 780 */     itemstackq.setDurability((short)1);
/* 781 */     p.getInventory().addItem(new ItemStack[] { itemstackq });
/* 782 */     if (countt == 1) {
/* 783 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.IRON_PERFECT, 3) });
/* 784 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.TOPAZE, 5) });
/* 785 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.MERCURE, 6) });
/* 786 */       ItemStack itemstack = new ItemStack(Material.MERCURE_LEGGINGS, 1);
/* 787 */       itemstack.addEnchantment(org.bukkit.enchantments.Enchantment.PROTECTION_ENVIRONMENTAL, 3);
/* 788 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.HAMBURGER, 16) });
/* 789 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.GOLDEN_APPLE, 2) });
/* 790 */       ItemStack itemstackA = new ItemStack(Material.TOPAZE_BOW, 1);
/* 791 */       itemstackA.addEnchantment(org.bukkit.enchantments.Enchantment.ARROW_FIRE, 1);
/* 792 */       p.getInventory().addItem(new ItemStack[] { itemstack });
/* 793 */       p.getInventory().addItem(new ItemStack[] { itemstackA });
/* 794 */     } else if (countt == 2) {
/* 795 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.FIRE_COOKIE, 1) });
/* 796 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.REGENERATION_COOKIE, 5) });
/* 797 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.STRENGTH_COOKIE, 3) });
/* 798 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.GOLDEN_APPLE, 2) });
/* 799 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.BLAZE_POWDER, 1) });
/* 800 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.IRON_PERFECT, 3) });
/* 801 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.TOPAZE, 5) });
/* 802 */       p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.MERCURE, 6) });
/* 803 */       ItemStack itemstack = new ItemStack(Material.MERCURE_LEGGINGS, 1);
/* 804 */       itemstack.addEnchantment(org.bukkit.enchantments.Enchantment.PROTECTION_ENVIRONMENTAL, 3);
/* 805 */       p.getInventory().addItem(new ItemStack[] { itemstack });
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean getPendingLoot(Player sender) { boolean ret;
/*     */     boolean ret;
/* 811 */     if (!this.main.getConfig().getBoolean(sender.getName() + ".loot")) {
/* 812 */       ret = false;
/*     */     } else
/* 814 */       ret = true;
/* 815 */     return ret;
/*     */   }
/*     */ }

