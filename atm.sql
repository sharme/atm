-- MySQL dump 10.13  Distrib 5.6.25, for osx10.10 (x86_64)
--
-- Host: localhost    Database: atm
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address_city`
--

DROP TABLE IF EXISTS `address_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_city` (
  `id_address_city` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) DEFAULT NULL COMMENT '编号',
  `level` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL COMMENT '级别 如 2，3',
  `name` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL COMMENT '名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级编号',
  `postcode` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL COMMENT '邮编',
  PRIMARY KEY (`id_address_city`)
) ENGINE=InnoDB AUTO_INCREMENT=1183 DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_city`
--

LOCK TABLES `address_city` WRITE;
/*!40000 ALTER TABLE `address_city` DISABLE KEYS */;
INSERT INTO `address_city` VALUES (789,110100,'2','北京市',110000,'100000'),(790,120100,'2','天津市',120000,'300000'),(791,130100,'2','石家庄市',130000,'050000'),(792,130200,'2','唐山市',130000,'063000'),(793,130300,'2','秦皇岛市',130000,'066000'),(794,130400,'2','邯郸市',130000,'056000'),(795,130500,'2','邢台市',130000,'054000'),(796,130600,'2','保定市',130000,'071000'),(797,130700,'2','张家口市',130000,'075000'),(798,130800,'2','承德市',130000,'067000'),(799,130900,'2','沧州市',130000,'061000'),(800,131000,'2','廊坊市',130000,'065000'),(801,131100,'2','衡水市',130000,'053000'),(802,140100,'2','太原市',140000,'030000'),(803,140200,'2','大同市',140000,'037000'),(804,140300,'2','阳泉市',140000,'045000'),(805,140400,'2','长治市',140000,'046000'),(806,140500,'2','晋城市',140000,'048000'),(807,140600,'2','朔州市',140000,'036000'),(808,140700,'2','晋中市',140000,'030600'),(809,140800,'2','运城市',140000,'044000'),(810,140900,'2','忻州市',140000,'034000'),(811,141000,'2','临汾市',140000,'041000'),(812,141100,'2','吕梁市',140000,'033000'),(813,150100,'2','呼和浩特市',150000,'010000'),(814,150200,'2','包头市',150000,'014000'),(815,150300,'2','乌海市',150000,'016000'),(816,150400,'2','赤峰市',150000,'024000'),(817,150500,'2','通辽市',150000,'028000'),(818,150600,'2','鄂尔多斯市',150000,'017004'),(819,150700,'2','呼伦贝尔市',150000,'021008'),(820,150800,'2','巴彦淖尔市',150000,'015001'),(821,150900,'2','乌兰察布市',150000,'012000'),(822,152200,'2','兴安盟',150000,'137401'),(823,152500,'2','锡林郭勒盟',150000,'026021'),(824,152900,'2','阿拉善盟',150000,'750306'),(825,210100,'2','沈阳市',210000,'110000'),(826,210200,'2','大连市',210000,'116000'),(827,210300,'2','鞍山市',210000,'114000'),(828,210400,'2','抚顺市',210000,'113000'),(829,210500,'2','本溪市',210000,'117000'),(830,210600,'2','丹东市',210000,'118000'),(831,210700,'2','锦州市',210000,'121000'),(832,210800,'2','营口市',210000,'115000'),(833,210900,'2','阜新市',210000,'123000'),(834,211000,'2','辽阳市',210000,'111000'),(835,211100,'2','盘锦市',210000,'124000'),(836,211200,'2','铁岭市',210000,'112000'),(837,211300,'2','朝阳市',210000,'122000'),(838,211400,'2','葫芦岛市',210000,'125000'),(839,220100,'2','长春市',220000,'130000'),(840,220200,'2','吉林市',220000,'132000'),(841,220300,'2','四平市',220000,'136000'),(842,220400,'2','辽源市',220000,'136200'),(843,220500,'2','通化市',220000,'134000'),(844,220600,'2','白山市',220000,'134300'),(845,220700,'2','松原市',220000,'138000'),(846,220800,'2','白城市',220000,'137000'),(847,222400,'2','延边朝鲜族自治州',220000,'133000'),(848,230100,'2','哈尔滨市',230000,'150000'),(849,230200,'2','齐齐哈尔市',230000,'161000'),(850,230300,'2','鸡西市',230000,'158100'),(851,230400,'2','鹤岗市',230000,'154100'),(852,230500,'2','双鸭山市',230000,'155100'),(853,230600,'2','大庆市',230000,'163000'),(854,230700,'2','伊春市',230000,'153000'),(855,230800,'2','佳木斯市',230000,'154000'),(856,230900,'2','七台河市',230000,'154600'),(857,231000,'2','牡丹江市',230000,'157000'),(858,231100,'2','黑河市',230000,'164300'),(859,231200,'2','绥化市',230000,'152000'),(860,232700,'2','大兴安岭地区',230000,'165000'),(861,310100,'2','上海市',310000,'200000'),(862,320100,'2','南京市',320000,'210000'),(863,320200,'2','无锡市',320000,'214000'),(864,320300,'2','徐州市',320000,'221000'),(865,320400,'2','常州市',320000,'213000'),(866,320500,'2','苏州市',320000,'215000'),(867,320600,'2','南通市',320000,'226000'),(868,320700,'2','连云港市',320000,'222000'),(869,320800,'2','淮安市',320000,'223200'),(870,320900,'2','盐城市',320000,'224000'),(871,321000,'2','扬州市',320000,'225000'),(872,321100,'2','镇江市',320000,'212000'),(873,321200,'2','泰州市',320000,'225300'),(874,321300,'2','宿迁市',320000,'223800'),(875,330100,'2','杭州市',330000,'310000'),(876,330200,'2','宁波市',330000,'315000'),(877,330300,'2','温州市',330000,'325000'),(878,330400,'2','嘉兴市',330000,'314000'),(879,330500,'2','湖州市',330000,'313000'),(880,330600,'2','绍兴市',330000,'312000'),(881,330700,'2','金华市',330000,'321000'),(882,330800,'2','衢州市',330000,'324000'),(883,330900,'2','舟山市',330000,'316000'),(884,331000,'2','台州市',330000,'318000'),(885,331100,'2','丽水市',330000,'323000'),(886,340100,'2','合肥市',340000,'230000'),(887,340200,'2','芜湖市',340000,'241000'),(888,340300,'2','蚌埠市',340000,'233000'),(889,340400,'2','淮南市',340000,'232000'),(890,340500,'2','马鞍山市',340000,'243000'),(891,340600,'2','淮北市',340000,'235000'),(892,340700,'2','铜陵市',340000,'244000'),(893,340800,'2','安庆市',340000,'246000'),(894,341000,'2','黄山市',340000,'245000'),(895,341100,'2','滁州市',340000,'239000'),(896,341200,'2','阜阳市',340000,'236000'),(897,341300,'2','宿州市',340000,'234000'),(898,341500,'2','六安市',340000,'237000'),(899,341600,'2','亳州市',340000,'236800'),(900,341700,'2','池州市',340000,'247000'),(901,341800,'2','宣城市',340000,'242000'),(902,350100,'2','福州市',350000,'350000'),(903,350200,'2','厦门市',350000,'361000'),(904,350300,'2','莆田市',350000,'351100'),(905,350400,'2','三明市',350000,'365000'),(906,350500,'2','泉州市',350000,'362000'),(907,350600,'2','漳州市',350000,'363000'),(908,350700,'2','南平市',350000,'353000'),(909,350800,'2','龙岩市',350000,'364000'),(910,350900,'2','宁德市',350000,'352100'),(911,360100,'2','南昌市',360000,'330000'),(912,360200,'2','景德镇市',360000,'333000'),(913,360300,'2','萍乡市',360000,'337000'),(914,360400,'2','九江市',360000,'332000'),(915,360500,'2','新余市',360000,'338000'),(916,360600,'2','鹰潭市',360000,'335000'),(917,360700,'2','赣州市',360000,'341000'),(918,360800,'2','吉安市',360000,'343000'),(919,360900,'2','宜春市',360000,'336000'),(920,361000,'2','抚州市',360000,'344000'),(921,361100,'2','上饶市',360000,'334000'),(922,370100,'2','济南市',370000,'250000'),(923,370200,'2','青岛市',370000,'266000'),(924,370300,'2','淄博市',370000,'255000'),(925,370400,'2','枣庄市',370000,'277100'),(926,370500,'2','东营市',370000,'257000'),(927,370600,'2','烟台市',370000,'264000'),(928,370700,'2','潍坊市',370000,'261000'),(929,370800,'2','济宁市',370000,'272100'),(930,370900,'2','泰安市',370000,'271000'),(931,371000,'2','威海市',370000,'264200'),(932,371100,'2','日照市',370000,'276800'),(933,371200,'2','莱芜市',370000,'271100'),(934,371300,'2','临沂市',370000,'276000'),(935,371400,'2','德州市',370000,'253000'),(936,371500,'2','聊城市',370000,'252000'),(937,371600,'2','滨州市',370000,'256600'),(938,371700,'2','菏泽市',370000,'274000'),(939,410100,'2','郑州市',410000,'450000'),(940,410200,'2','开封市',410000,'475000'),(941,410300,'2','洛阳市',410000,'471000'),(942,410400,'2','平顶山市',410000,'467000'),(943,410500,'2','安阳市',410000,'455000'),(944,410600,'2','鹤壁市',410000,'458000'),(945,410700,'2','新乡市',410000,'453000'),(946,410800,'2','焦作市',410000,'454000'),(947,410881,'3','济源市',410000,'454650'),(948,410900,'2','濮阳市',410000,'457000'),(949,411000,'2','许昌市',410000,'461000'),(950,411100,'2','漯河市',410000,'462000'),(951,411200,'2','三门峡市',410000,'472000'),(952,411300,'2','南阳市',410000,'473000'),(953,411400,'2','商丘市',410000,'476000'),(954,411500,'2','信阳市',410000,'464000'),(955,411600,'2','周口市',410000,'466000'),(956,411700,'2','驻马店市',410000,'463000'),(957,420100,'2','武汉市',420000,'430000'),(958,420200,'2','黄石市',420000,'435000'),(959,420300,'2','十堰市',420000,'442000'),(960,420500,'2','宜昌市',420000,'443000'),(961,420600,'2','襄阳市',420000,'441000'),(962,420700,'2','鄂州市',420000,'436000'),(963,420800,'2','荆门市',420000,'448000'),(964,420900,'2','孝感市',420000,'432000'),(965,421000,'2','荆州市',420000,'434000'),(966,421100,'2','黄冈市',420000,'438000'),(967,421200,'2','咸宁市',420000,'437100'),(968,421300,'2','随州市',420000,'441300'),(969,422800,'2','恩施土家族苗族自治州',420000,''),(970,429004,'3','仙桃市',420000,'433000'),(971,429005,'3','潜江市',420000,'433100'),(972,429006,'3','天门市',420000,'431700'),(973,429021,'3','神农架林区',420000,'442400'),(974,430100,'2','长沙市',430000,'410000'),(975,430200,'2','株洲市',430000,'412000'),(976,430300,'2','湘潭市',430000,'411100'),(977,430400,'2','衡阳市',430000,'421000'),(978,430500,'2','邵阳市',430000,'422000'),(979,430600,'2','岳阳市',430000,'414000'),(980,430700,'2','常德市',430000,'415000'),(981,430800,'2','张家界市',430000,'427000'),(982,430900,'2','益阳市',430000,'413000'),(983,431000,'2','郴州市',430000,'423000'),(984,431100,'2','永州市',430000,'425000'),(985,431200,'2','怀化市',430000,'418000'),(986,431300,'2','娄底市',430000,'417000'),(987,433100,'2','湘西土家族苗族自治州',430000,'416000'),(988,440100,'2','广州市',440000,'510000'),(989,440200,'2','韶关市',440000,'512000'),(990,440300,'2','深圳市',440000,'518000'),(991,440400,'2','珠海市',440000,'519000'),(992,440500,'2','汕头市',440000,'515000'),(993,440600,'2','佛山市',440000,'528000'),(994,440700,'2','江门市',440000,'529000'),(995,440800,'2','湛江市',440000,'524000'),(996,440900,'2','茂名市',440000,'525000'),(997,441200,'2','肇庆市',440000,'526000'),(998,441300,'2','惠州市',440000,'516000'),(999,441400,'2','梅州市',440000,'514000'),(1000,441500,'2','汕尾市',440000,'516600'),(1001,441600,'2','河源市',440000,'517000'),(1002,441700,'2','阳江市',440000,'529500'),(1003,441800,'2','清远市',440000,'511500'),(1004,441900,'2','东莞市',440000,'523000'),(1005,442000,'2','中山市',440000,'528400'),(1006,442101,'2','东沙群岛',440000,''),(1007,445100,'2','潮州市',440000,'521000'),(1008,445200,'2','揭阳市',440000,'522000'),(1009,445300,'2','云浮市',440000,'527300'),(1010,450100,'2','南宁市',450000,'530000'),(1011,450200,'2','柳州市',450000,'545000'),(1012,450300,'2','桂林市',450000,'541000'),(1013,450400,'2','梧州市',450000,'543000'),(1014,450500,'2','北海市',450000,'536000'),(1015,450600,'2','防城港市',450000,'538000'),(1016,450700,'2','钦州市',450000,'535000'),(1017,450800,'2','贵港市',450000,'537100'),(1018,450900,'2','玉林市',450000,'537000'),(1019,451000,'2','百色市',450000,'533000'),(1020,451100,'2','贺州市',450000,'542800'),(1021,451200,'2','河池市',450000,'547000'),(1022,451300,'2','来宾市',450000,'546100'),(1023,451400,'2','崇左市',450000,'532200'),(1024,460100,'2','海口市',460000,'570000'),(1025,460200,'2','三亚市',460000,'572000'),(1026,460300,'2','三沙市',460000,''),(1027,469001,'3','五指山市',460000,'572200'),(1028,469002,'3','琼海市',460000,'571400'),(1029,469003,'3','儋州市',460000,'571700'),(1030,469005,'3','文昌市',460000,'571300'),(1031,469006,'3','万宁市',460000,'571500'),(1032,469007,'3','东方市',460000,'572600'),(1033,469025,'3','定安县',460000,'571200'),(1034,469026,'3','屯昌县',460000,'571600'),(1035,469027,'3','澄迈县',460000,'571900'),(1036,469028,'3','临高县',460000,'571800'),(1037,469030,'3','白沙黎族自治县',460000,'572800'),(1038,469031,'3','昌江黎族自治县',460000,'572700'),(1039,469033,'3','乐东黎族自治县',460000,'572500'),(1040,469034,'3','陵水黎族自治县',460000,'572400'),(1041,469035,'3','保亭黎族苗族自治县',460000,'572300'),(1042,469036,'3','琼中黎族苗族自治县',460000,'572900'),(1043,469037,'3','西沙群岛',460000,'573100'),(1044,469038,'3','南沙群岛',460000,'573100'),(1045,469039,'3','中沙群岛的岛礁及其海域',460000,'573100'),(1046,500100,'2','重庆市',500000,'400000'),(1047,510100,'2','成都市',510000,'610000'),(1048,510300,'2','自贡市',510000,'643000'),(1049,510400,'2','攀枝花市',510000,'617000'),(1050,510500,'2','泸州市',510000,'646000'),(1051,510600,'2','德阳市',510000,'618000'),(1052,510700,'2','绵阳市',510000,'621000'),(1053,510800,'2','广元市',510000,'628000'),(1054,510900,'2','遂宁市',510000,'629000'),(1055,511000,'2','内江市',510000,'641000'),(1056,511100,'2','乐山市',510000,'614000'),(1057,511300,'2','南充市',510000,'637000'),(1058,511400,'2','眉山市',510000,'620000'),(1059,511500,'2','宜宾市',510000,'644000'),(1060,511600,'2','广安市',510000,'638000'),(1061,511700,'2','达州市',510000,'635000'),(1062,511800,'2','雅安市',510000,'625000'),(1063,511900,'2','巴中市',510000,'636000'),(1064,512000,'2','资阳市',510000,'641300'),(1065,513200,'2','阿坝藏族羌族自治州',510000,''),(1066,513300,'2','甘孜藏族自治州',510000,''),(1067,513400,'2','凉山彝族自治州',510000,''),(1068,520100,'2','贵阳市',520000,'550000'),(1069,520200,'2','六盘水市',520000,'553000'),(1070,520300,'2','遵义市',520000,'563000'),(1071,520400,'2','安顺市',520000,'561000'),(1072,522200,'2','铜仁市',520000,''),(1073,522300,'2','黔西南布依族苗族自治州',520000,''),(1074,522400,'2','毕节市',520000,''),(1075,522600,'2','黔东南苗族侗族自治州',520000,''),(1076,522700,'2','黔南布依族苗族自治州',520000,''),(1077,530100,'2','昆明市',530000,'650000'),(1078,530300,'2','曲靖市',530000,'655000'),(1079,530400,'2','玉溪市',530000,''),(1080,530500,'2','保山市',530000,''),(1081,530600,'2','昭通市',530000,'657000'),(1082,530700,'2','丽江市',530000,''),(1083,530800,'2','普洱市',530000,'665000'),(1084,530900,'2','临沧市',530000,''),(1085,532300,'2','楚雄彝族自治州',530000,''),(1086,532500,'2','红河哈尼族彝族自治州',530000,''),(1087,532600,'2','文山壮族苗族自治州',530000,''),(1088,532800,'2','西双版纳傣族自治州',530000,''),(1089,532900,'2','大理白族自治州',530000,''),(1090,533100,'2','德宏傣族景颇族自治州',530000,''),(1091,533300,'2','怒江傈僳族自治州',530000,''),(1092,533400,'2','迪庆藏族自治州',530000,''),(1093,540100,'2','拉萨市',540000,'850000'),(1094,542100,'2','昌都地区',540000,''),(1095,542200,'2','山南地区',540000,''),(1096,542300,'2','日喀则地区',540000,''),(1097,542400,'2','那曲地区',540000,''),(1098,542500,'2','阿里地区',540000,''),(1099,542600,'2','林芝地区',540000,''),(1100,610100,'2','西安市',610000,'710000'),(1101,610200,'2','铜川市',610000,'727000'),(1102,610300,'2','宝鸡市',610000,'721000'),(1103,610400,'2','咸阳市',610000,'712000'),(1104,610500,'2','渭南市',610000,'714000'),(1105,610600,'2','延安市',610000,'716000'),(1106,610700,'2','汉中市',610000,'723000'),(1107,610800,'2','榆林市',610000,'719000'),(1108,610900,'2','安康市',610000,'725000'),(1109,611000,'2','商洛市',610000,'726000'),(1110,620100,'2','兰州市',620000,'730000'),(1111,620200,'2','嘉峪关市',620000,'735100'),(1112,620300,'2','金昌市',620000,'737100'),(1113,620400,'2','白银市',620000,''),(1114,620500,'2','天水市',620000,''),(1115,620600,'2','武威市',620000,'733000'),(1116,620700,'2','张掖市',620000,'734000'),(1117,620800,'2','平凉市',620000,'744000'),(1118,620900,'2','酒泉市',620000,'735000'),(1119,621000,'2','庆阳市',620000,''),(1120,621100,'2','定西市',620000,'743000'),(1121,621200,'2','陇南市',620000,''),(1122,622900,'2','临夏回族自治州',620000,''),(1123,623000,'2','甘南藏族自治州',620000,'747000'),(1124,630100,'2','西宁市',630000,'810000'),(1125,632100,'2','海东市',630000,''),(1126,632200,'2','海北藏族自治州',630000,''),(1127,632300,'2','黄南藏族自治州',630000,''),(1128,632500,'2','海南藏族自治州',630000,''),(1129,632600,'2','果洛藏族自治州',630000,''),(1130,632700,'2','玉树藏族自治州',630000,''),(1131,632800,'2','海西蒙古族藏族自治州',630000,''),(1132,640100,'2','银川市',640000,'750000'),(1133,640200,'2','石嘴山市',640000,''),(1134,640300,'2','吴忠市',640000,'751100'),(1135,640400,'2','固原市',640000,'756000'),(1136,640500,'2','中卫市',640000,''),(1137,650100,'2','乌鲁木齐市',650000,'830000'),(1138,650200,'2','克拉玛依市',650000,'834000'),(1139,652100,'2','吐鲁番地区',650000,'838000'),(1140,652200,'2','哈密地区',650000,'839000'),(1141,652300,'2','昌吉回族自治州',650000,'831100'),(1142,652700,'2','博尔塔拉蒙古自治州',650000,'833400'),(1143,652800,'2','巴音郭楞蒙古自治州',650000,'841000'),(1144,652900,'2','阿克苏地区',650000,'843000'),(1145,653000,'2','克孜勒苏柯尔克孜自治州',650000,'845350'),(1146,653100,'2','喀什地区',650000,'844000'),(1147,653200,'2','和田地区',650000,'848000'),(1148,654000,'2','伊犁哈萨克自治州',650000,'835000'),(1149,654200,'2','塔城地区',650000,'834700'),(1150,654300,'2','阿勒泰地区',650000,'836500'),(1151,659001,'3','石河子市',650000,'832000'),(1152,659002,'3','阿拉尔市',650000,'843300'),(1153,659003,'3','图木舒克市',650000,'843806'),(1154,659004,'3','五家渠市',650000,'831300'),(1155,710100,'2','台北市',710000,''),(1156,710200,'2','高雄市',710000,''),(1157,710300,'2','台南市',710000,''),(1158,710400,'2','台中市',710000,''),(1159,710500,'2','金门县',710000,''),(1160,710600,'2','南投县',710000,''),(1161,710700,'2','基隆市',710000,''),(1162,710800,'2','新竹市',710000,''),(1163,710900,'2','嘉义市',710000,''),(1164,711100,'2','新北市',710000,''),(1165,711200,'2','宜兰县',710000,''),(1166,711300,'2','新竹县',710000,''),(1167,711400,'2','桃园县',710000,''),(1168,711500,'2','苗栗县',710000,''),(1169,711700,'2','彰化县',710000,''),(1170,711900,'2','嘉义县',710000,''),(1171,712100,'2','云林县',710000,''),(1172,712400,'2','屏东县',710000,''),(1173,712500,'2','台东县',710000,''),(1174,712600,'2','花莲县',710000,''),(1175,712700,'2','澎湖县',710000,''),(1176,712800,'2','连江县',710000,''),(1177,810100,'2','香港岛',810000,''),(1178,810200,'2','九龙',810000,''),(1179,810300,'2','新界',810000,''),(1180,820100,'2','澳门半岛',820000,''),(1181,820200,'2','离岛',820000,''),(1182,990100,'2','海外',990000,'');
/*!40000 ALTER TABLE `address_city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_company`
--

DROP TABLE IF EXISTS `atm_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_company` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_type` varchar(48) NOT NULL,
  `c_address` varchar(255) DEFAULT NULL,
  `c_country` varchar(48) DEFAULT NULL,
  `c_province` varchar(48) DEFAULT NULL,
  `c_city` varchar(48) DEFAULT NULL,
  `c_people` int(11) DEFAULT NULL,
  `c_desc` text,
  `c_logo` varchar(255) DEFAULT NULL,
  `c_mobile_phone` varchar(13) DEFAULT NULL,
  `c_qq` varchar(13) DEFAULT NULL,
  `c_owner` varchar(48) DEFAULT NULL,
  `c_phone` varchar(13) DEFAULT NULL,
  `c_website` varchar(255) DEFAULT NULL,
  `c_limit` int(11) DEFAULT NULL,
  `c_pic` varchar(255) DEFAULT NULL,
  `c_pic2` varchar(255) DEFAULT NULL,
  `c_pic3` varchar(255) DEFAULT NULL,
  `c_created_by` varchar(48) DEFAULT NULL,
  `c_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `c_updated_by` varchar(48) DEFAULT NULL,
  `c_updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`c_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_company_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_company`
--

LOCK TABLES `atm_company` WRITE;
/*!40000 ALTER TABLE `atm_company` DISABLE KEYS */;
INSERT INTO `atm_company` VALUES (1,1,'房公司','工业','区镇北路',NULL,NULL,'天津',5,'xxxxxxxxxx here is the description','xxxxxxxxx here is the logo','868516850','475673272','小姚','139174414','www.fmyoutu.com',NULL,'xxxxxxx here is the pic of the company',NULL,NULL,NULL,'2017-06-27 16:21:08',NULL,'2017-06-27 16:21:08');
/*!40000 ALTER TABLE `atm_company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_designers`
--

DROP TABLE IF EXISTS `atm_designers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_designers` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `d_name` varchar(255) NOT NULL,
  `d_age` int(11) NOT NULL,
  `d_desc` text,
  `d_type` varchar(48) NOT NULL,
  `d_country` varchar(48) DEFAULT NULL,
  `d_province` varchar(48) DEFAULT NULL,
  `d_city` varchar(48) DEFAULT NULL,
  `d_address` varchar(255) DEFAULT NULL,
  `d_pic` varchar(255) DEFAULT NULL,
  `d_pic2` varchar(255) DEFAULT NULL,
  `d_pic3` varchar(255) DEFAULT NULL,
  `d_created_by` varchar(48) DEFAULT NULL,
  `d_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `d_updated_by` varchar(48) DEFAULT NULL,
  `d_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`d_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_designers_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_designers`
--

LOCK TABLES `atm_designers` WRITE;
/*!40000 ALTER TABLE `atm_designers` DISABLE KEYS */;
INSERT INTO `atm_designers` VALUES (1,1,'神药',27,'Being strong is the only thing you can do','文化',NULL,NULL,'上海','虹口区大连西路','图片地址....xxxxxxxxxxxx',NULL,NULL,NULL,'2017-06-28 00:22:20',NULL,'2017-06-28 00:22:20');
/*!40000 ALTER TABLE `atm_designers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_events`
--

DROP TABLE IF EXISTS `atm_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_events` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) DEFAULT NULL,
  `e_logo` varchar(255) NOT NULL,
  `e_name` varchar(255) NOT NULL,
  `e_type` varchar(48) DEFAULT NULL,
  `e_sponsors` varchar(255) DEFAULT NULL,
  `e_co_sponsors` varchar(255) DEFAULT NULL,
  `e_country` varchar(48) DEFAULT NULL,
  `e_province` varchar(48) DEFAULT NULL,
  `e_city` varchar(48) DEFAULT NULL,
  `e_address` varchar(255) NOT NULL,
  `e_start_date` datetime NOT NULL,
  `e_end_date` datetime NOT NULL,
  `e_description` text NOT NULL,
  `e_created_by` varchar(48) DEFAULT NULL,
  `e_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `e_updated_by` varchar(48) DEFAULT NULL,
  `e_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_events`
--

LOCK TABLES `atm_events` WRITE;
/*!40000 ALTER TABLE `atm_events` DISABLE KEYS */;
INSERT INTO `atm_events` VALUES (1,NULL,'www.fmyoutu.com','2018中国（广州）先进制造与智能工厂展览会','工业',NULL,NULL,NULL,NULL,'广州','广交会琶洲展馆','2018-05-23 00:00:00','2018-05-25 00:00:00','从设计到制造，从生产到物流，精确定位探讨工厂未来同期举办2017第9届中国（广州）国际物流装备与技术展览（LETCHINA），本展为华南最有影响力的物流展会。今年到场参与品牌展商包括：英特尔、斑马技术、爱鸥、力优、西斯特姆、合肥井松、深圳怡丰、江苏高科、上海和进、福莱瑞达、海通、远能、艾瑞思、极智嘉、海康、靠普、铃、坦能等等迎合制造业发展需要，主办方广州市巴斯特会展有限公司在物流装备展基础上，新设IMS展会。',NULL,'2017-06-25 23:22:27',NULL,'2017-06-25 23:22:27'),(2,NULL,'http://www.cnena.com/upload_files/ck/images/6928_1490332255_5552368.jpg','2017第十七届中国塑料交易会(台州塑交会)','工业',NULL,NULL,NULL,NULL,'台州','台州国际会展中心','2017-10-12 00:00:00','2017-10-15 00:00:00',' 上届数据： 2016年10月12日-15日，第十六届中国塑料交易会（ChinaPEC’2016）”在浙江台州市国际会展中心（路桥）盛大举行，展览面积35000平方米，展位1600个，参展企业600家，专业观众4万多人次，海外采购商涉及30多个国家上千人。',NULL,'2017-06-25 23:25:18',NULL,'2017-06-25 23:25:18'),(3,NULL,'http://www.cnena.com/upload_files/qb_topzhanhui_/41/15338_20170621080654_JUM0JUNGJUJFJUE5MTgw.jpg','2017第九届南京文化创意产业交易会(南京文交会)','文化',NULL,NULL,NULL,NULL,'南京','南京国际博览中心','2017-09-22 00:00:00','2017-09-24 00:00:00','为把南京建设成全国重要文化创意中心城市，推动江苏文化强省建设，2006年首届南京文交会正式亮相，迄今已成功举办了八届，一直致力于整合区域文化资源、促进文化产业的交流与合作，成功搭建起文化产业项目合作、产品交易、资本链接与信息共享的重要平台，累计实现签约总额370亿元，访客达80万人次，2016年被中国会展行业年会组委会评为“中国十佳品牌展览会”，成为具有全国影响力的文化产业会展品牌。\n\n2017第九届南京文交会是国内唯一聚焦文化科技融合、唯一由科技部门和宣传部门共同举办、唯一由国家级文化和科技融合示范基地管理办公室支持的展会，展区面积将达3.8万平方米，举办文化产业精品项目交流对接会、全国文化产业新媒体峰会、商贸配对洽谈会、中国虚拟现实领先人才对接会、VR技术交流会等专业活动，以及文化科技融合创新展、中国南京数字娱乐生活展、中国南京全域旅游展、中国华东地区文创礼品及赠品展等。其间，江苏省创意设计大赛及“紫金奖”颁奖典礼、南京森林音乐节、第三届南京创意设计周等一系列城市文化活动也将同期在南京举行。\n\n第九届南京文交会真诚期待全国文化名企、行业大咖和广大观众的热情参与。金秋九月，美丽南京，期待与您相约！\n\n第九届南京文交会会议及活动:\n\n1、文化产业精品项目交流对接会\n文化金融机构、投资机构、文创基金公司等机构将参会，为全国文化企业和文化项目搭建融资合作平台，推动优质文化项目落地。\n2、商贸配对洽谈会\n为参展企业和专业买家提供面对面信息交流平台，创造更多商贸合作机会。\n3、“VR READY”VR技术交流会\n国际知名基础组件供应商将莅临现场与国内企业面对面对话，共同探讨前沿技术动态，推动本土VR相关企业开拓国际市场。\n4、中国虚拟现实领先人才对接会\n全国领先的VR人才培训机构，包括相关专业大学、职业教育学校等，将携手与企业对接，输送更多专业人才。\n5、第二届全国文化产业新媒体峰会\n全国著名文化产业类新媒体、积极寻求转型的大型文化类媒体集团、文化类互联网公司、知名传媒院校、知识内容提供商等将云集峰会，共同探讨新技术、新应用及新趋势下文化产业新媒体如何创造新内容、新价值和新前景。\n6、首届“礼道好礼”杰出文化创意产品奖评审\n知名评委将从参展单位提报的文化创意产品中评出最佳创意奖（产品和设计），并在展会现场举行颁奖典礼。',NULL,'2017-06-25 23:27:59',NULL,'2017-06-25 23:27:59');
/*!40000 ALTER TABLE `atm_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_exhibitors`
--

DROP TABLE IF EXISTS `atm_exhibitors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_exhibitors` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `e_name` varchar(255) NOT NULL,
  `e_type` varchar(48) DEFAULT NULL,
  `e_desc` text,
  `e_people` int(11) DEFAULT NULL,
  `e_logo` varchar(255) DEFAULT NULL,
  `e_mobile_phone` varchar(13) DEFAULT NULL,
  `e_qq` varchar(13) DEFAULT NULL,
  `e_phone` varchar(13) DEFAULT NULL,
  `e_owner` varchar(48) DEFAULT NULL,
  `e_website` varchar(255) DEFAULT NULL,
  `e_address` varchar(255) DEFAULT NULL,
  `e_country` varchar(48) DEFAULT NULL,
  `e_province` varchar(48) DEFAULT NULL,
  `e_city` varchar(48) DEFAULT NULL,
  `e_created_by` varchar(48) DEFAULT NULL,
  `e_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `e_updated_by` varchar(48) DEFAULT NULL,
  `e_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`e_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_exhibitors_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_exhibitors`
--

LOCK TABLES `atm_exhibitors` WRITE;
/*!40000 ALTER TABLE `atm_exhibitors` DISABLE KEYS */;
INSERT INTO `atm_exhibitors` VALUES (1,1,'普话搭建有限公司','工业','具体貌似, xxxxxxxx',7,'https://timgsa.baidu.tp%3A%2F%2Fimgstore.cdn.sogou.com%2Fapp%2Fa%2F100540002%2F481521.jpg','868516850','475673272','1391745504','miwang','www.fmyoutu.com','上海普陀区镇北路222',NULL,NULL,'上海',NULL,'2017-06-28 00:22:02',NULL,'2017-06-28 00:22:02');
/*!40000 ALTER TABLE `atm_exhibitors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_feedbacks`
--

DROP TABLE IF EXISTS `atm_feedbacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_feedbacks` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `f_msg` text NOT NULL,
  `f_created_by` varchar(48) DEFAULT NULL,
  `f_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `f_updated_by` varchar(48) DEFAULT NULL,
  `f_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_feedbacks`
--

LOCK TABLES `atm_feedbacks` WRITE;
/*!40000 ALTER TABLE `atm_feedbacks` DISABLE KEYS */;
INSERT INTO `atm_feedbacks` VALUES (1,1,'能不能再做的好一些. !!!我们可以创造奇迹, 贡献社会','admin','2017-06-28 01:27:54',NULL,'2017-06-28 01:27:54'),(2,1,'this is just a test !!!',NULL,'2017-06-28 01:39:30',NULL,'2017-06-28 01:39:30'),(3,1,'I am going to add another feedback for this!',NULL,'2017-06-28 01:39:52',NULL,'2017-06-28 01:39:52'),(4,1,'创业的路很艰难！很坎坷！很孤独！但是不要放弃. 不要给失败找理由. ',NULL,'2017-07-05 16:08:40',NULL,'2017-07-05 16:08:40');
/*!40000 ALTER TABLE `atm_feedbacks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_newest`
--

DROP TABLE IF EXISTS `atm_newest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_newest` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_from` int(11) NOT NULL,
  `n_to` int(11) DEFAULT NULL,
  `n_message` varchar(255) NOT NULL,
  `n_created_by` varchar(48) DEFAULT NULL,
  `n_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `n_updated_by` varchar(48) DEFAULT NULL,
  `n_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_newest`
--

LOCK TABLES `atm_newest` WRITE;
/*!40000 ALTER TABLE `atm_newest` DISABLE KEYS */;
INSERT INTO `atm_newest` VALUES (1,1,NULL,'注册成功',NULL,'2017-06-22 13:27:36',NULL,'2017-06-22 13:27:36'),(2,2,NULL,'测试操作',NULL,'2017-06-24 22:09:43',NULL,'2017-06-24 22:09:43'),(3,6,2,'this is another test.',NULL,'2017-06-24 22:46:15',NULL,'2017-06-24 22:46:15');
/*!40000 ALTER TABLE `atm_newest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_notifications`
--

DROP TABLE IF EXISTS `atm_notifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_notifications` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `n_to` int(11) DEFAULT NULL,
  `n_msg` text NOT NULL,
  `n_type` int(11) DEFAULT NULL,
  `n_created_by` varchar(48) DEFAULT NULL,
  `n_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `n_updated_by` varchar(48) DEFAULT NULL,
  `n_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_notifications`
--

LOCK TABLES `atm_notifications` WRITE;
/*!40000 ALTER TABLE `atm_notifications` DISABLE KEYS */;
INSERT INTO `atm_notifications` VALUES (1,1,NULL,'欢迎 miwangyao加入阿童木,  你的加入, 让我们相信 我们可以创造奇迹, 贡献社会',1,'admin','2017-06-28 00:54:06',NULL,'2017-06-28 00:54:06'),(2,1,NULL,'能不能再做的好一些. !!!我们可以创造奇迹, 贡献社会',NULL,'admin','2017-06-28 01:19:06',NULL,'2017-06-28 01:19:06');
/*!40000 ALTER TABLE `atm_notifications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_roles`
--

DROP TABLE IF EXISTS `atm_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_roles` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(48) NOT NULL,
  `r_desc` varchar(255) DEFAULT NULL,
  `r_created_by` varchar(48) DEFAULT NULL,
  `r_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `r_updated_by` varchar(48) DEFAULT NULL,
  `r_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_roles`
--

LOCK TABLES `atm_roles` WRITE;
/*!40000 ALTER TABLE `atm_roles` DISABLE KEYS */;
INSERT INTO `atm_roles` VALUES (1,'参展商',NULL,'admin','2017-06-27 18:06:42','admin','2017-06-27 18:06:42'),(2,'主办方',NULL,'admin','2017-06-27 18:06:56','admin','2017-06-27 18:06:56'),(3,'设计师',NULL,'admin','2017-06-27 18:07:07','admin','2017-06-27 18:07:07'),(4,'展台搭建公司',NULL,'admin','2017-06-27 18:07:20','admin','2017-06-27 18:07:20'),(5,'展友',NULL,'admin','2017-06-27 18:07:43','admin','2017-06-27 18:07:43');
/*!40000 ALTER TABLE `atm_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_users`
--

DROP TABLE IF EXISTS `atm_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_users` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) NOT NULL,
  `u_phone_num` varchar(13) DEFAULT NULL,
  `u_email` varchar(255) DEFAULT NULL,
  `u_pwd` varchar(48) NOT NULL,
  `u_status` tinyint(10) NOT NULL,
  `u_avatar` varchar(255) DEFAULT NULL,
  `u_desc` varchar(255) DEFAULT NULL,
  `u_address` varchar(255) DEFAULT NULL,
  `u_role` int(11) NOT NULL,
  `u_created_by` varchar(48) DEFAULT NULL,
  `u_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `u_updated_by` varchar(48) DEFAULT NULL,
  `u_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_name` (`u_name`),
  UNIQUE KEY `u_phone_num` (`u_phone_num`),
  UNIQUE KEY `u_email` (`u_email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_users`
--

LOCK TABLES `atm_users` WRITE;
/*!40000 ALTER TABLE `atm_users` DISABLE KEYS */;
INSERT INTO `atm_users` VALUES (1,'小小姚','8613917455041',NULL,'testdddd',1,'https://jira.hq.unity3d.com/browse/CPQ-163','this is another test.','上海虹口大连西路',1,'admin','2017-06-27 17:22:39',NULL,'2017-07-05 15:40:03'),(2,'atm1','13917455041',NULL,'123456qwe',1,NULL,NULL,NULL,3,NULL,'2017-07-05 16:35:19',NULL,'2017-07-05 16:35:19');
/*!40000 ALTER TABLE `atm_users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-05 17:49:56
