/*     */ package fr.koora.jumpconquest.listeners;
/*     */ 
/*     */ import fr.koora.jumpconquest.Main;
/*     */ import fr.koora.jumpconquest.manager.EventManager;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ 
/*     */ public class CommandListener implements org.bukkit.command.CommandExecutor
/*     */ {
/*     */   private Main main;
/*     */   
/*     */   public CommandListener(Main main)
/*     */   {
/*  14 */     this.main = main;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmdLabel, String label, String[] args)
/*     */   {
/*  20 */     if (args.length == 0) {
/*  21 */       sender.sendMessage(ChatColor.GRAY + "-------------- " + ChatColor.GOLD + "Aide" + ChatColor.GRAY + " --------------");
/*  22 */       if (sender.isOp()) {
/*  23 */         sender.sendMessage(ChatColor.GOLD + "/jquest spawn - " + ChatColor.GRAY + "Faire apparaitre l'évent.");
/*  24 */         sender.sendMessage(ChatColor.GOLD + "/jquest timer - " + ChatColor.GRAY + "Faire apparaitre l'évent avec un délais de 5 minutes.");
/*  25 */         sender.sendMessage(ChatColor.GOLD + "/jquest end - " + ChatColor.GRAY + "Arrête l'évent.");
/*     */       }
/*  27 */       sender.sendMessage(ChatColor.GOLD + "/jquest loot - " + ChatColor.GRAY + "Récupérer sa récompense.");
/*  28 */       return true;
/*     */     }
/*     */     
/*  31 */     if ((args[0].equals("spawn")) && (args.length == 1)) {
/*  32 */       if (sender.isOp()) {
/*  33 */         if (this.main.isSpawn) {
/*  34 */           sender.sendMessage(ChatColor.RED + "L'événement est déjà lancé !");
/*  35 */           return true;
/*     */         }
/*  37 */         this.main.manager.spawnEvent();
/*  38 */         sender.sendMessage(ChatColor.GREEN + "Event en cours de lancement !");
/*  39 */         return true;
/*     */       }
/*  41 */       sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès à cette commande.");
/*     */     }
/*     */     
/*     */ 
/*  45 */     if ((args[0].equals("timer")) && (args.length == 1)) {
/*  46 */       if (sender.isOp()) {
/*  47 */         if (this.main.isSpawn) {
/*  48 */           sender.sendMessage(ChatColor.RED + "L'événement est déjà lancé !");
/*  49 */           return true;
/*     */         }
/*  51 */         this.main.startTimer();
/*  52 */         sender.sendMessage(ChatColor.GREEN + "Event en cours de lancement !");
/*  53 */         return true;
/*     */       }
/*  55 */       sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès à cette commande.");
/*     */     }
/*     */     
/*     */ 
/*  59 */     if ((args[0].equals("end")) && (args.length == 1)) {
/*  60 */       if (sender.isOp()) {
/*  61 */         if (!this.main.isSpawn) {
/*  62 */           sender.sendMessage(ChatColor.RED + "L'événement n'est pas lancé !");
/*  63 */           return true;
/*     */         }
/*  65 */         this.main.manager.killEvent();
/*  66 */         sender.sendMessage(ChatColor.GREEN + "Event arreté !");
/*  67 */         return true;
/*     */       }
/*  69 */       sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès à cette commande.");
/*     */     }
/*     */     
/*     */ 
/*  73 */     if ((args[0].equals("setjump")) && (args.length == 1)) {
/*  74 */       if (sender.isOp()) {
/*  75 */         this.main.manager.setupJump();
/*  76 */         return true;
/*     */       }
/*  78 */       sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès à cette commande.");
/*     */     }
/*     */     
/*     */ 
/*  82 */     if ((args[0].equals("killjump")) && (args.length == 1)) {
/*  83 */       if (sender.isOp()) {
/*  84 */         this.main.manager.killJump();
/*  85 */         return true;
/*     */       }
/*  87 */       sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès à cette commande.");
/*     */     }
/*     */     
/*     */ 
/*  91 */     if ((args[0].equals("loot")) && (args.length == 1)) {
/*  92 */       if (this.main.manager.getPendingLoot((org.bukkit.entity.Player)sender)) {
/*  93 */         this.main.manager.giveRecomp((org.bukkit.entity.Player)sender);
/*     */       } else {
/*  95 */         sender.sendMessage(ChatColor.RED + "Vous n'avez aucune récompense en attente !");
/*     */       }
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     sender.sendMessage(ChatColor.RED + "Erreur: syntaxe inconnue. /" + args.length + "/");
/* 101 */     return true;
/*     */   }
/*     */ }
