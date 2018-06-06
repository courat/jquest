/*    */ package fr.koora.jumpconquest.listeners;
/*    */ 
/*    */ import fr.koora.jumpconquest.Main;
/*    */ import fr.koora.jumpconquest.manager.EventManager;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ 
/*    */ public class JoinListener implements org.bukkit.event.Listener
/*    */ {
/*    */   private Main main;
/*    */   
/*    */   public JoinListener(Main main)
/*    */   {
/* 14 */     this.main = main;
/*    */   }
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void playerJoinEvent(PlayerJoinEvent e) {
/* 19 */     Player p = e.getPlayer();
/* 20 */     if (this.main.manager.getPendingLoot(p)) {
/* 21 */       p.sendMessage(org.bukkit.ChatColor.GREEN + "Vous avez un récompense en attente, pour la récuperer, faites /jquest loot !");
/*    */     }
/*    */   }
/*    */ }
