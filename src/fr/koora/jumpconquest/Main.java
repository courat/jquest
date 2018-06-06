/*     */ package fr.koora.jumpconquest;
/*     */ 
/*     */ import fr.koora.jumpconquest.listeners.JoinListener;
/*     */ import fr.koora.jumpconquest.manager.EventManager;
/*     */ import java.io.File;
/*     */ import net.milkbowl.vault.economy.Economy;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.plugin.PluginManager;
/*     */ import org.bukkit.plugin.RegisteredServiceProvider;
/*     */ import org.bukkit.plugin.ServicesManager;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class Main extends org.bukkit.plugin.java.JavaPlugin
/*     */ {
/*     */   public int brokeblock;
/*     */   public int limitblock;
/*     */   public boolean isSpawn;
/*     */   public EventManager manager;
/*  22 */   public String prefix = "§7[§6Plutonia§7]§c ";
/*  23 */   public String world = "world";
/*  24 */   public int x = 1627;
/*  25 */   public int y = 108;
/*  26 */   public int z = 649;
/*  27 */   public Material mat = Material.GLASS;
/*  28 */   public Material mat1 = Material.HARD_CLAY;
/*  29 */   public Material matafter = Material.AIR;
/*  30 */   public Material ladder = Material.LADDER;
/*  31 */   public Material jumpblock = Material.JUMP_BLOCK;
/*  32 */   public Material inviblock = Material.INVISIBLE_BLOCK;
/*  33 */   public Material mat2 = Material.COBBLE_WALL;
/*  34 */   public Economy economy = null;
/*     */   
/*     */   public void onEnable() {
/*  37 */     PluginManager pm = Bukkit.getPluginManager();
/*  38 */     setupConfig();
/*  39 */     setupEconomy();
/*  40 */     this.isSpawn = false;
/*  41 */     this.brokeblock = 0;
/*  42 */     this.limitblock = 14;
/*  43 */     this.manager = new EventManager(this);
/*  44 */     pm.registerEvents(new fr.koora.jumpconquest.listeners.BreakListener(this), this);
/*  45 */     pm.registerEvents(new JoinListener(this), this);
/*  46 */     getCommand("jquest").setExecutor(new fr.koora.jumpconquest.listeners.CommandListener(this));
/*     */   }
/*     */   
/*     */   public void onDisable() {
/*  50 */     saveConfig();
/*  51 */     if (this.isSpawn) this.manager.killEvent();
/*     */   }
/*     */   
/*     */   private void setupEconomy() {
/*  55 */     RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(Economy.class);
/*  56 */     if (economyProvider != null) {
/*  57 */       this.economy = ((Economy)economyProvider.getProvider());
/*     */     }
/*     */   }
/*     */   
/*     */   public void setupConfig() {
/*  62 */     File config = new File(getDataFolder(), "config.yml");
/*  63 */     if (!config.exists()) {
/*  64 */       getConfig().options().copyDefaults(true);
/*  65 */       saveConfig();
/*     */     }
/*     */   }
/*     */   
/*     */   public void startTimer() {
/*  70 */     Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
/*  71 */       int a = 300;
/*  72 */       String realLoc = "X: " + Main.this.x + ", Y: " + Main.this.y + ", Z: " + Main.this.z + "§c.";
/*     */       
/*  74 */       public void run() { switch (this.a) {
/*     */         case 300: 
/*  76 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 5 minutes, il se trouve en §6" + this.realLoc);
/*  77 */           break;
/*     */         case 240: 
/*  79 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 4 minutes, il se trouve en §6" + this.realLoc);
/*  80 */           break;
/*     */         case 180: 
/*  82 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 3 minutes, il se trouve en §6" + this.realLoc);
/*  83 */           break;
/*     */         case 120: 
/*  85 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 2 minutes, il se trouve en §6" + this.realLoc);
/*  86 */           break;
/*     */         case 60: 
/*  88 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 1 minute, il se trouve en §6" + this.realLoc);
/*  89 */           break;
/*     */         case 30: 
/*  91 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 30 secondes, il se trouve en §6" + this.realLoc);
/*  92 */           break;
/*     */         case 10: 
/*  94 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 10 secondes, il se trouve en §6" + this.realLoc);
/*  95 */           break;
/*     */         case 5: 
/*  97 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 5 secondes, il se trouve en §6" + this.realLoc);
/*  98 */           break;
/*     */         case 4: 
/* 100 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 4 secondes, il se trouve en §6" + this.realLoc);
/* 101 */           break;
/*     */         case 3: 
/* 103 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 3 secondes, il se trouve en §6" + this.realLoc);
/* 104 */           break;
/*     */         case 2: 
/* 106 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 2 secondes, il se trouve en §6" + this.realLoc);
/* 107 */           break;
/*     */         case 1: 
/* 109 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest commence dans 1 seconde, il se trouve en §6" + this.realLoc);
/* 110 */           break;
/*     */         case 0: 
/* 112 */           Bukkit.broadcastMessage(Main.this.prefix + "Le JumpConquest est apparu en " + "X:" + Main.this.x + ", Y:" + Main.this.y + ", Z:" + Main.this.z);
/* 113 */           Main.this.manager.spawnEvent();
/*     */         }
/*     */         
/* 116 */         this.a -= 1;
/*     */       }
/* 118 */     }, 20L, 20L);
/*     */   }
/*     */ }