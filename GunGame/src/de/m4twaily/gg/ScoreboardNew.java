package de.m4twaily.gg;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ScoreboardNew {

	@SuppressWarnings("deprecation")
	public static void doScoreboard(Player p) {
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective obj = board.registerNewObjective("aaa", "bbb");
		obj.setDisplaySlot(org.bukkit.scoreboard.DisplaySlot.SIDEBAR);
		obj.setDisplayName("§2§lGunGame");

		Score spacer01 = obj.getScore(" ");
		spacer01.setScore(13);
		Score level_name = obj.getScore("§6§lRang");
		level_name.setScore(12);
		Score rang_name = obj.getScore("" + PermissionsEx.getUser(p).getGroups()[0].getPrefix().replaceAll("&", "§"));
		rang_name.setScore(11);
		Score spacer02 = obj.getScore("  ");
		spacer02.setScore(10);
		Score level = obj.getScore("§6§lLevel");
		level.setScore(9);
		Score coins = obj.getScore(" §a§l" + p.getLevel());
		coins.setScore(8);
		Score spacer03 = obj.getScore("   ");
		spacer03.setScore(7);
		Score online_name = obj.getScore("§6§lOnline");
		online_name.setScore(6);
		Score online = obj.getScore("§a§l " + Bukkit.getServer().getOnlinePlayers().size());
		online.setScore(5);

		p.setScoreboard(board);

		// Owner
		Team Owner = board.registerNewTeam("01Owner");

		// Admin
		Team Admin = board.registerNewTeam("02Admin");

		// Dev
		Team SrDeveloper = board.registerNewTeam("03SrDeveloper");
		Team Developer = board.registerNewTeam("04Developer");
		Team JrDeveloper = board.registerNewTeam("05JrDeveloper");

		// Mod
		Team SrModerator = board.registerNewTeam("06SrModerator");
		Team Moderator = board.registerNewTeam("07Moderator");

		// Sup
		Team SrSupporter = board.registerNewTeam("08SrSupporter");
		Team Supporter = board.registerNewTeam("09Supporter");
		Team JrSupporter = board.registerNewTeam("010Supporter");

		// Builder
		Team SrBuilder = board.registerNewTeam("11SrBuilder");
		Team Builder = board.registerNewTeam("12Builder");
		Team JrBuilder = board.registerNewTeam("13JrBuilder");

		Team YouTuber = board.registerNewTeam("14YouTuber");
		Team Diamond = board.registerNewTeam("15Diamond");
		Team Emerald = board.registerNewTeam("16Emerald");
		Team Premium = board.registerNewTeam("17Premium");
		Team Spieler = board.registerNewTeam("18Spieler");

		Owner.setPrefix("§4Owner §8| §4");

		Admin.setPrefix("§4Admin §8| §4");

		SrDeveloper.setPrefix("§bSrDev §8| §b");
		Developer.setPrefix("§bDev §8| §b");
		JrDeveloper.setPrefix("§bJrDev §8| §b");

		SrModerator.setPrefix("§cSrMod §8| §c");
		Moderator.setPrefix("§cMod §8| §c");

		SrSupporter.setPrefix("§9SrSup §8| §9");
		Supporter.setPrefix("§9Sup §8| §9");
		JrSupporter.setPrefix("§9JrSup §8| §9");

		SrBuilder.setPrefix("§2SrBuild §8| §2");
		Builder.setPrefix("§2Build §8| §2");
		JrBuilder.setPrefix("§2JrBuild §8| §2");

		YouTuber.setPrefix("§5YT §8| §5");
		Diamond.setPrefix("§bDiamond §8| §b");
		Emerald.setPrefix("§aEmerald §8| §a");
		Premium.setPrefix("§6Premium §8| §6");
		Spieler.setPrefix("§7");

		for (Player a : Bukkit.getOnlinePlayers()) {
			// Owner
			if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Owner")) {
				Owner.addEntry(a.getName());

				// Admin
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Admin")) {
				Admin.addEntry(a.getName());

				// Dev
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("SrDev")) {
				SrDeveloper.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Dev")) {
				Developer.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("JrDev")) {
				JrDeveloper.addEntry(a.getName());

				// Mod
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("SrMod")) {
				SrModerator.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Mod")) {
				Moderator.addEntry(a.getName());

				// Sup
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("SrSup")) {
				SrSupporter.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Sup")) {
				Supporter.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("JrSup")) {
				JrSupporter.addEntry(a.getName());

				// Builder
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("SrBuilder")) {
				SrBuilder.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Builder")) {
				Builder.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("JrBuilder")) {
				JrBuilder.addEntry(a.getName());

				// players
			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("YT")) {
				YouTuber.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Diamond")) {
				Diamond.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Emerald")) {
				Emerald.addEntry(a.getName());

			} else if (PermissionsEx.getUser(a).getGroups()[0].getName().equalsIgnoreCase("Premium")) {
				Premium.addEntry(a.getName());

			} else {
				Spieler.addEntry(a.getName());
			}

		}
	}
}
