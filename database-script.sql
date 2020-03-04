-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.21-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for sjakktrekkbets
CREATE DATABASE IF NOT EXISTS `sjakktrekkbets` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sjakktrekkbets`;

-- Dumping structure for table sjakktrekkbets.article
CREATE TABLE IF NOT EXISTS `article` (
  `article_id` int(50) NOT NULL AUTO_INCREMENT,
  `image_name` varchar(50) NOT NULL DEFAULT '0',
  `title` varchar(200) DEFAULT NULL,
  `heading` varchar(500) DEFAULT NULL,
  `category` varchar(10000) DEFAULT NULL,
  `league_name` varchar(200) DEFAULT NULL,
  `odds_text` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.article: ~7 rows (approximately)
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`article_id`, `image_name`, `title`, `heading`, `category`, `league_name`, `odds_text`) VALUES
	(29, 'article-29.jpg', 'Premier League Game week 10', NULL, '<p><strong>Montoya&nbsp;</strong> two yellows in 8. Averages 3.1 tackles per game (8th). Will be up against Digne and Bernard, with Richarlison as a mobile striker who will move in spaces.&nbsp; <strong>Stephens</strong> have only one card this season, but havebeen printing cards over his last seasons. 2.7 tackles per game / 1.1 fouls willgive him more cards. Everton is playing with a offensive three that midfield and i can see Stephens get in trouble. More bets will be posted in this article. Follow <a href="https://twitter.com/Scandibetter"><strong>@Scandibetter</strong></a>&nbsp;</p>\n<p>Good luck if you follow any of These tips. And always remember; bet with responsibility!</p>\n<p><em>26. October 2019, 10:38</em>&nbsp;</p>', 'Champions League', 'Oddstip'),
	(30, 'article-30.jpg', 'NFL Weekly Breakdown # 4', NULL, '<p>&nbsp;<strong>NFL Week 7:</strong></p>\n<p>Good afternoon</p>\n<p>I have six selections for this weeks NFL / NCAAF and we have the five plays from last week to review as well so let\'s get too it!</p>\n<p><strong>Iowa State Cyclones @ Texas Tech Raiders</strong> (19/10/19, 18:00 pm)</p>\n<p>Texas Tech have had a Difficult schedule the past three weeks facing all RANKED teams and have not faired too badly but this Iowa State team should once again be too much for them. Whilst both teams offense\'s are RANKED pretty similarly stats wise the Cyclones have averaged an extra six point per game so far this season. But, this game will be Decided on the defensive end and that\'s where Iowa State outmatch themselve. They have a very good rushing defense whichwill force the Raiders two throw the ball a lot more and whichwill apply pressure on QB Alan Bowman and he will ask Constantly looking for their main reciever TJ Vasher who I expect Iowa State two cover well, wherea the Cyclones have multiple different recievers They use and a lot more options offensively.</p>\n<p><em>Selection: Iowa State -7 @ 1.91 (</em> <a href="https://ads.leovegas.com/redirect.aspx?pid=3596985&amp;bid=15818" target="_blank"><em>LeoVegas</em></a> <em>) 7U</em></p>\n<p><strong>Temple owls @ SMU Mustangs</strong> (19/10/19, 21:00 pm)</p>\n<p>Both teams come into this match having great seasons respectively, especially Temple WHO have two hard Fought close wins over RANKED opponents. The owners were the # 19 RANKED SMU havebeen an offensive powerhouse so far thisyear and I really like what I\'ve seen from themselve and I feel like Reviews those two wins from the Owls has caused themselve to be overvalued, I make this line around - 12.5. SMU are averaging 44.2 ppg and whilst the Owls have put up solid defensive stats so far this season the Mustangs should be too much for them.</p>\n<p><em>Selection: SMU Mustangs -7.5 @ 1.83 (</em> <a href="http://wleuroearners.adsrv.eacdn.com/C.ashx?btag=a_164563b_2212c_&amp;affid=2252&amp;siteid=164563&amp;adid=2212&amp;c=" target="_blank"><em>Bethard</em></a> <em>) 5U</em></p>\n<p><strong>Kansas Jayhawks @ Texas Longhorns</strong> (20/10/19 01:00 am)</p>\n<p>The # 15 RANKED Texas havebeen evenmore impressive thisyear under Sam Ehlinger this season. They stand at 4.2 but have only Suffered defeats against two of the top five teams in the country in Oklahome and LSU, both of them only being by 7 points as well. Wherea, the Jayhawks ae coming into this one on the back of three straight unloaded with the cargo two being over 21 points and I expect themselve two struggle once again here. Ehlinger has thrown for 500 more yards, 2 less interceptions and five more touchdowns than Stanley and the Jayhawks Rely pretty heavily on Pooka Williams Jr. for rushing yards. The Longhorns have a very strong and competent offensive line so it\'s going to be very tough for Williams Jr. and the Jayhawks two create scrambles.</p>\n<p><em>Selection: Texas Longhorn -21 @ 1.9 (Bet365) 5U</em></p>\n<p><strong>Jacksonville Jaguar @ Cincinnati Bengal</strong> (20/10/19, 18:00 pm)</p>\n<p>Yes the Bengals are 0-6 But they\'ve lost four incredibly close games so far this season and we will once again be taking themselve on the spread (currently 1.1 for us). Cincinnati are a better team than These lines suggest each week and until They change (I expect themselve too après They get their first win) I\'m going to find it Difficult not to take themselve each week. There\'s no way this line should be four, I make it around a pick \'em matchup slightly favoring the Bengals, especially with home field advantage.</p>\n<p><em>Selection: Cincinnati Bengals 4 @ 1.93 (</em> <a href="http://wleuroearners.adsrv.eacdn.com/C.ashx?btag=a_164563b_2212c_&amp;affid=2252&amp;siteid=164563&amp;adid=2212&amp;c=" target="_blank"><em>Bethard</em></a> <em>) 5U</em></p>\n<p><strong>New England Patriots @ New York Jets</strong> (22/10/19 02:15 am)</p>\n<p>New England will meet the Jets for the second time this season and Despite Darnold being back so the Jets will be more productive offensively I expect very much the same. The first game finished 30-14 (we were on the Jets 22) and Brady\'s Patriots destroyed the Jets offensively and rallied in the 30 points before putting in all the second strings. With the line being at -7.5 they\'re basically saying That Darnold accrues for 14.5 points being knocked off the spread wooden absurd and their defensive line is still the same. In once again expect the dominant Patriots two comfortably win this matchup and continue their the flawless start to the season.</p>\n<p><em>Selection: New England Patriots -7.5 @ 1.8 (</em> <a href="https://ads.leovegas.com/redirect.aspx?pid=3596985&amp;bid=15818" target="_blank"><em>LeoVegas</em></a> <em>) 5U</em></p>\n<p><u><strong>Last Weeks Results:</strong></u></p>\n<p>New Mexico State 10.5 @ Central Michigan Chippewas <em>(Final Result 28-42)</em> &nbsp;<strong>LOSS -5 Units</strong></p>\n<p>Georiga State Panthers 5.5 @ Coastal Carolina&nbsp; <em>(Final Result 31-21)</em> &nbsp;<strong>WIN 4 Units</strong></p>\n<p>Cincinnati Bengals 12 @ Baltimore Ravens&nbsp; <em>(Final Result 17-12)</em> &nbsp;<strong>WIN 3.85 Units</strong></p>\n<p>San Francisco 49ers @ LA Rams -3 <em>(Final Result 7.20)</em> <strong>LOSS -7 Units</strong> &nbsp;</p>\n<p>Detroit Lions 3.5 @ Green Bay Packers <em>&nbsp;(Final Result 22-23)&nbsp;</em> <strong>WIN 4.85 Units</strong></p>\n<p>NFL Breakdown Weekly P / L: 0.7 Units</p>\n<p><strong>NFL Breakdown All Time P / L: -7.25 Units</strong></p>\n<p>Thank you very much for reading and if you have any questions please feel free to contact me.</p>\n<p>@ Aw0ba</p>\n<p><em>19 October 2019, 2:26 p.m.</em>&nbsp;</p>', 'Champions League', 'Oddstip'),
	(31, 'article-31.jpg', 'NBA REGULAR SEASON,NBA REGULAR SEASON', NULL, '<p>The NBA season is finally here.</p>\n<p>This year the NBA seems more Balanced than what it was last year. Top players have gone two different teams and everyone seems two have a "duo". It\'s not clear as two Who the favorite to win this year should be, as we all know the Warriors were the favorites for the past years.&nbsp;</p>\n<p>There are players thatwill be missing out some games / whole season due two injuries was performed. This will Affect some teams Because The star players are the ones That are injured. Klay Thompson (Golden State Warriors), Kevin Durant (Brooklyn Nets) and Paul George (LA Clippers) are all injured for the first games atleast.&nbsp;</p>\n<p><u><strong>BETS:</strong></u></p>\n<p>LA Lakers -2.5 vs LA Clippers @ 1.90 <a href="https://ads.leovegas.com/redirect.aspx?pid=3596985&amp;bid=15818" target="_blank">LeoVegas</a> (8 units)</p>\n<p>Toronto Raptors - 6.5 vs New Orleans Pelicans @ 1.86 <a href="https://ads.leovegas.com/redirect.aspx?pid=3596985&amp;bid=15818" target="_blank">LeoVegas</a> (7 units)</p>\n<p>I think the Lakers are going to be one of the best teams this season. Lebron James and Anthony Davis playing together will benefit the team a lot cheaper than its fancy have an all around good team. I do believe That Clippers will be good as well but for this match Paul George will not be playing so I think the value here is on the Lakers.</p>\n<p>Raptors are going to be playing without Kawhia this season Because he is playing for the Clippers now. I still think the Raptors will takethis Because They are still a good team. Zion Williamson will Also- not be playing for the Pelicans in this match due two injury. I do not see the Pelicans winning this without him.&nbsp;</p>\n<p><u><strong>NOTE:</strong></u></p>\n<p>Based of what I\'ve seen I think the value is on These two games, however the first week I will not be posting a lot of games due to new rosters on pretty much every single team. So I will be watching the games and looking at results the first week or two before I start posting daily.</p>\n<p>GOOD LUCK!&nbsp;</p>\n<p>@iDanizeh&nbsp;</p>\n<p><em>21. October 2019 17:50</em>&nbsp;</p>', 'Champions League', 'Oddstip'),
	(32, 'article-32.jpg', 'Astralis vs Liquid,Astralis vs Liquid', NULL, '<p>&nbsp;</p>\n<p>Astralis used to be the # 1 team in the world for a very long time. They started two fall off at the start of 2019 where their rivals (Liquid) took over the # 1 place. They were losing tournaments in the early stages and They also lost two teams that were not even in top 5.</p>\n<p>Liquid have beaten every single team and won Grand Slam wooden ($ 1M) competition at the start of the year. It\'s fair to say They are still No. 1 on paper but however due two recentemente form I do believe That Astralis will take the throne again.&nbsp;</p>\n<p>BET:</p>\n<p>Astralis ML vs Liquid @ 1.75 <a href="http://bit.ly/2eGciLX" target="_blank">Pinnacle</a> (8 units)&nbsp;</p>\n<p><u><strong>Reasoning:</strong></u></p>\n<p>Astralis have shown us That They are back and They are ready to take that # 1 spot again. They won the major wooden the biggest Counter-Strike: Global Offensive tournament hosted by Valve. They completely destroyed every single team and I feel like They are ready to take that # 1 spot again. If you look at \'recent form, Astralis is the better team and that\'s how I look at most of my bets. I do believe That you can bounce back specially if you havebeen at # 1 before.</p>\n<p>Liquid on the otherhand have started two lose a lot lately Where they have shaky games and seeminterested two not be on the same page in game. Liquid are known two have the best aim out of any team and their Fragger seeminterested two not be on That level anymore. I do believe Liquid will bounce back at one point but Astralis has way better teamwork and has a better plan on most maps.&nbsp;</p>', 'Champions League', 'Oddstip'),
	(34, 'article-34.jpg', 'UFC 243 Melbourne,UFC 243 Melbourne', NULL, '<p>&nbsp;<strong>(5-0-0)</strong> Yorgan De Castro vs Justin Tafa <strong>(3-0-0)</strong></p>\n<p><strong>Date: 06/10/19</strong></p>\n<p><strong>Time: ~ 04: 15</strong></p>\n<p><strong>Bookie:</strong> <a href="https://ads.leovegas.com/redirect.aspx?pid=3596985&amp;bid=15818" rel="noopener" target="_blank"><strong>LeoVegas</strong></a><br>\n</p>\n<p><strong>Stake: 7/10</strong></p>\n<p><strong>Odds: 2.25</strong><br>\n</p>\n<p><u><strong>BET:</strong></u> <u><strong>Justin Tafa to win in Round 1-2</strong></u><br>\n</p>\n<p>This fight will take place in the heavyweight division, both fighters has heavy hands and their physical attributes Regarding height and reach are nearly the same. Castro\'s game are very reliant on his kicks, his footwork is weak and tender two have his head in a straight line wooden could spell trouble. He is very deficient in his stand-up game, his boxing is not crisp, has a low guard and will not shy from getting into a slug match where technical abilites are thrown out the window. Tafa is the more technical fighters of These two, has immense power in his hands and comes from a camp where others killers Tyson Pedro Tai Tuivasa and the legend Mark Hunt workwith him most of the time. While working with Pedro we can Assum That Tafa has somewhat of a wrestling game aswell, but this fight screams \'\' stand and bang \'\'.<br>\n</p>\n<p>I believe Tafa is the more complete and better fighters of These two. Tafa has never seen the judges scorecards, while Castro has seen it once. It is a heavyweight fights, meaning it will probably end in a TKO somewhat in the early-mid round. The odds are that Pickem, but I believe Tafa should be a larger favorite, Because of his technical stand up abilites wooden ends fights rather Quickly.</p>', 'Champions League', 'Oddstip'),
	(35, 'article-35.jpg', 'Odds Tips: Champions League Wednesday,Odds Tips: Champions League Wednesday', 'new value heading', '<p>&nbsp;<strong>Odds Tips: Champions League Wednesday</strong>&nbsp;</p>', 'Champions League', 'Oddstip'),
	(36, 'article-36.jpg', 'Odds Tips: Champions League Wednesday', 'lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum', '<p>&nbsp;<strong>Odds Tips: Champions League Wednesday</strong>&nbsp;</p>', 'Champions League', 'Oddstip'),
	(41, 'article-41.jpg', 'test', 'test', '<p>test</p>', 'test', 'test');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.banner
CREATE TABLE IF NOT EXISTS `banner` (
  `banner_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_name` varchar(200) NOT NULL,
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.banner: ~2 rows (approximately)
/*!40000 ALTER TABLE `banner` DISABLE KEYS */;
INSERT INTO `banner` (`banner_id`, `image_name`) VALUES
	(4, 'banner-4.png'),
	(6, 'banner-6.png');
/*!40000 ALTER TABLE `banner` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.bet
CREATE TABLE IF NOT EXISTS `bet` (
  `bet_id` int(11) NOT NULL AUTO_INCREMENT,
  `match_desc` varchar(100) DEFAULT NULL,
  `bet_desc` varchar(50) DEFAULT NULL,
  `kick_off_date` date DEFAULT NULL,
  `kick_off_time` time DEFAULT NULL,
  `bet_type` varchar(50) DEFAULT NULL,
  `sport` int(11) DEFAULT NULL,
  `league` int(11) DEFAULT NULL,
  `odds` decimal(10,2) DEFAULT NULL,
  `stake` varchar(50) DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `is_premium` tinyint(4) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `bookie` int(11) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.bet: ~6 rows (approximately)
/*!40000 ALTER TABLE `bet` DISABLE KEYS */;
INSERT INTO `bet` (`bet_id`, `match_desc`, `bet_desc`, `kick_off_date`, `kick_off_time`, `bet_type`, `sport`, `league`, `odds`, `stake`, `description`, `is_premium`, `status`, `bookie`, `image`) VALUES
	(31, 'Liverpool - Chelsea ', 'liverpool wins', '2019-10-08', '22:00:00', 'testing', 1, 5, 2.20, '2', 'lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum ', 0, 'WON', 17, 'bet-31.jpg'),
	(32, 'Championship - England', 'Liverpool', '2019-09-28', '21:04:00', 'Top scorer', 1, 6, 2.10, '5', 'The lead to Middlesbrough scored last season 14 goals in 28 games from the start, playing a total of 2683 mins last season. Became 26 years old and has several seasons with good numbers on scores, best season was 2013/2014 when he scored 24 goals for Peterbrough in league 1. Has the last seasons scored 103 goals in 18088 min, that\'s an average of scoring pr 173 min and it is very nice. Last season he played under Tony Pullis and it was a sad Middlesbrough team we saw in action, during Woodgate they should play more attractive football and it should fit Assombalonga much better. I think this team is going to score a lot but that they also come in and drop in a lot, unfortunately. Been linked away a lot but nothing happened yet, think he\'s coming and being out this season. Assombalonga is a penalty shooter with both head and feet, a complete tip many might say. Tipping he ends up somewhere in between 20-25 goals, bet he\'ll start tonight with a couple of boxes. Equal odds at both NB / BF SP / Bet365.', NULL, 'LOST', 20, 'bet-32.jpg'),
	(33, 'Liverpool - Chelsea', 'liverpool wins', '2020-01-16', '01:00:00', 'Home draw', 2, 7, 2.20, '9', 'sdfadf', NULL, 'WON', 17, NULL),
	(34, 'Liverpool - Chelsea', 'liverpool wins', '2020-01-13', '16:00:00', 'testing', 2, 6, 2.00, '2', 'dsdf', NULL, NULL, 20, 'bet-34.png'),
	(35, 'test', 'liverpool wins', '2020-01-16', '02:00:00', 'testing', 2, 5, 2.00, '3', 'ggg', NULL, NULL, 18, 'bet-35.png'),
	(36, 'Liverpool - Chelsea', 'Liverpool', '2020-01-02', '18:05:00', 'Home draw', 8, 7, 1.00, '2', 'test', NULL, NULL, 20, 'bet-36.jpg');
/*!40000 ALTER TABLE `bet` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.bet-type-lookup
CREATE TABLE IF NOT EXISTS `bet-type-lookup` (
  `bet-type-id` int(11) NOT NULL AUTO_INCREMENT,
  `name` int(11) DEFAULT NULL,
  PRIMARY KEY (`bet-type-id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.bet-type-lookup: ~0 rows (approximately)
/*!40000 ALTER TABLE `bet-type-lookup` DISABLE KEYS */;
/*!40000 ALTER TABLE `bet-type-lookup` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.bonus
CREATE TABLE IF NOT EXISTS `bonus` (
  `bonus_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `affiliate_url_home` varchar(100) DEFAULT NULL,
  `affiliate_url_reg` varchar(100) DEFAULT NULL,
  `odds` decimal(10,2) DEFAULT NULL,
  `wagering` int(11) DEFAULT NULL,
  `bookie` int(11) DEFAULT NULL,
  `bonus_text` varchar(50) DEFAULT NULL,
  `rank` int(11) DEFAULT NULL,
  PRIMARY KEY (`bonus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.bonus: ~2 rows (approximately)
/*!40000 ALTER TABLE `bonus` DISABLE KEYS */;
INSERT INTO `bonus` (`bonus_id`, `title`, `affiliate_url_home`, `affiliate_url_reg`, `odds`, `wagering`, `bookie`, `bonus_text`, `rank`) VALUES
	(1, 'Free 100% up 1.200kr ', 'https://www.oddseliten.nu/link2/5b5873a18441420004fd94dc', 'https://www.oddseliten.nu/link2/5b5873a18441420004fd94dc', 2.30, 1, 20, 'Get bonus', 2),
	(2, 'Risk Free-Play 1.000kr', 'https://www.oddseliten.nu/link2/56c2172a3b274c03008a6ab8', 'https://www.oddseliten.nu/link2/56c2172a3b274c03008a6ab8', 1.50, 1, 23, 'Get bonus', 1),
	(3, 'test', 'home', 'home', 3.00, 4, 21, 'text', 3);
/*!40000 ALTER TABLE `bonus` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.bookie
CREATE TABLE IF NOT EXISTS `bookie` (
  `bookie_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `poster` varchar(100) DEFAULT NULL,
  `url_home` varchar(500) DEFAULT NULL,
  `url_registration` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`bookie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.bookie: ~6 rows (approximately)
/*!40000 ALTER TABLE `bookie` DISABLE KEYS */;
INSERT INTO `bookie` (`bookie_id`, `name`, `poster`, `url_home`, `url_registration`) VALUES
	(17, 'betsson', 'bookie-17.png', 'www.bettson.com', 'https://www.oddseliten.nu/link2/56c2172a3b274c03008a6ab8'),
	(18, 'bethard', 'bookie-18.png', 'bethard.com', NULL),
	(20, 'Leo Vegas', 'bookie-20.png', 'www.bettson.com', 'https://www.oddseliten.nu/link2/56c2172a3b274c03008a6ab8'),
	(21, 'Betway', 'bookie-21.png', 'www', NULL),
	(22, 'Nordicbet', 'bookie-22.jpg', 'www', 'www'),
	(23, 'Betsafe', 'bookie-23.png', 'www', NULL);
/*!40000 ALTER TABLE `bookie` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.hibernate_sequence: ~0 rows (approximately)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.league
CREATE TABLE IF NOT EXISTS `league` (
  `league_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`league_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.league: ~5 rows (approximately)
/*!40000 ALTER TABLE `league` DISABLE KEYS */;
INSERT INTO `league` (`league_id`, `name`) VALUES
	(5, 'UEFA'),
	(6, 'CPL'),
	(7, 'La Liga'),
	(8, 'NBA'),
	(9, 'UFC');
/*!40000 ALTER TABLE `league` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.role
CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.role: ~2 rows (approximately)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`role_id`, `name`) VALUES
	(1, 'ROLE_ADMIN'),
	(2, 'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.sport
CREATE TABLE IF NOT EXISTS `sport` (
  `sport_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`sport_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.sport: ~3 rows (approximately)
/*!40000 ALTER TABLE `sport` DISABLE KEYS */;
INSERT INTO `sport` (`sport_id`, `name`) VALUES
	(1, 'Football'),
	(2, 'Golf'),
	(6, 'Cricket'),
	(8, 'Basketball');
/*!40000 ALTER TABLE `sport` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.user
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'inactive',
  `email` varchar(50) NOT NULL,
  `password` varchar(200) DEFAULT NULL,
  `country` varchar(200) DEFAULT NULL,
  `user_role` varchar(50) DEFAULT 'ROLE_USER',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.user: ~6 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `name`, `status`, `email`, `password`, `country`, `user_role`) VALUES
	(1, 'Nataniel Civuli', 'ACTIVE', 'nat@gmail.com', '$2a$10$1eRjFUtlQz./QbgcNP8DSO6aZS/uJLJMG3xFG1A.nyZ0DeJji05ay', 'Belgium', 'ROLE_ADMIN'),
	(6, 'Nataniel Civuli', 'INACTIVE', 'test1@gmail.com', NULL, NULL, 'ROLE_USER'),
	(23, 'Ajmal Hasan', 'INACTIVE', 'ajmal@skild.com', '$2a$10$641O.Ovvo6jgz6HRyQo1QOTBT4sVXvLRmRxfMRshlOnaoBDct5GxG', NULL, 'ROLE_USER'),
	(24, 'Ajmal Hasan', 'ACTIVE', 'syed.ajmal.hasan@gmail.com', '$2a$10$UgcJvJPdQ4F/13gaZoJXs.gxAgnmKZKnh13PfT0RTQQxaP3HBibh6', NULL, 'ROLE_USER'),
	(25, '', 'INACTIVE', '', '$2a$10$73cl.dbLJZNyBYTRb1O3BuEP3dlifzPlKChi.6nGWe0MfsY0uEeQq', NULL, 'ROLE_USER'),
	(26, '', 'INACTIVE', 'f', '$2a$10$NavAm.4EM8nWT5nRZfjVOOct7L9LsDXonrUW9tAluT79qD8mimcxi', NULL, 'ROLE_USER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table sjakktrekkbets.verification_token
CREATE TABLE IF NOT EXISTS `verification_token` (
  `verification_token_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0',
  `token` varchar(500) DEFAULT NULL,
  `expiry_date` datetime DEFAULT NULL,
  PRIMARY KEY (`verification_token_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table sjakktrekkbets.verification_token: ~5 rows (approximately)
/*!40000 ALTER TABLE `verification_token` DISABLE KEYS */;
INSERT INTO `verification_token` (`verification_token_id`, `user_id`, `token`, `expiry_date`) VALUES
	(5, 21, '46f75cb2-1ec8-43a9-be82-674d151ea638', '2019-10-27 11:33:22'),
	(6, 22, '03f65768-0c23-41ba-b86b-8179386a73c9', '2019-10-27 11:56:01'),
	(7, 23, '6229eeb6-b018-46f7-b2b1-7e0fcb74ba02', '2019-10-27 12:04:04'),
	(8, 25, '2515abb9-a0bb-4366-abaa-a0b7d285a718', '2020-01-20 07:35:07'),
	(9, 26, 'd2a0f634-6d81-45c8-8be4-9a4268b4a51a', '2020-01-20 07:40:04');
/*!40000 ALTER TABLE `verification_token` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
