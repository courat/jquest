/*    */ package fr.koora.jumpconquest.listeners;
/*    */ 
/*    */ import fr.koora.jumpconquest.Main;
/*    */ import net.milkbowl.vault.economy.Economy;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.block.BlockBreakEvent;
/*    */ 
/*    */ public class BreakListener implements org.bukkit.event.Listener
/*    */ {
/*    */   private Main main;
/*    */   
/*    */   public BreakListener(Main main)
/*    */   {
/* 18 */     this.main = main;
/*    */   }
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void blockBreakEvent(BlockBreakEvent e) {
/* 23 */     if (this.main.isSpawn) {
/* 24 */       Block breakedb = e.getBlock();
/* 25 */       if (breakedb.getLocation().equals(new Location(Bukkit.getWorld(this.main.world), this.main.x, this.main.y, this.main.z))) {
/* 26 */         Player p = e.getPlayer();
/* 27 */         e.setCancelled(true);
/* 28 */         if (this.main.brokeblock < this.main.limitblock) {
/* 29 */           this.main.brokeblock += 1;
/* 30 */           p.sendMessage("§2Vous avez reçu 500$ pour avoir cassé un bloc du Jump !");
/* 31 */           this.main.economy.depositPlayer(p.getName(), 500.0D);
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 41 */           p.teleport(new Location(Bukkit.getWorld(this.main.world), 1627.0D, 64.0D, 667.0D));
/* 42 */           p.setVelocity(new org.bukkit.util.Vector(3.0D, 0.5D, 3.0D));
/* 43 */           p.sendMessage(this.main.prefix + " §aVous avez été téléporté en dehors du JumpConquest !");
/*    */           
/* 45 */           Bukkit.broadcastMessage(this.main.prefix + p.getName() + " §7a détruit un bloc de la tour ! §c(" + this.main.brokeblock + "/" + (this.main.limitblock + 1) + ")");
/*    */         } else {
/* 47 */           Bukkit.broadcastMessage(this.main.prefix + p.getName() + " §ca détruit le dernier bloc, merci à tous d'avoir participés !");
/* 48 */           p.sendMessage("§aPour avoir ta récompense, tape la commande:§6 /jquest loot§a.");
/* 49 */           this.main.manager.killEvent();
/* 50 */           this.main.getConfig().set(p.getName() + ".loot", Boolean.valueOf(true));
/* 51 */           this.main.saveConfig();
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }

