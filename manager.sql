/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : manager

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-12-15 21:12:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(5) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `book_name` varchar(30) NOT NULL,
  `book_pub` varchar(30) NOT NULL,
  `count` int(255) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `book_type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`book_name`,`book_pub`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('00143', '1', '21', '21', '2020-12-15 20:58:13', null);
INSERT INTO `book` VALUES ('00080', '1', '3', '0', '2020-12-15 20:23:13', '军事类');
INSERT INTO `book` VALUES ('00082', '1', '4', '0', '2020-12-15 20:23:27', '军事类');
INSERT INTO `book` VALUES ('00085', '1', '5', '0', '2020-12-15 20:25:44', '经济类');
INSERT INTO `book` VALUES ('00097', '1', '6', '0', '2020-12-15 20:33:19', '哲学类');
INSERT INTO `book` VALUES ('00108', '1', '7', '0', '2020-12-15 20:45:12', '哲学类');
INSERT INTO `book` VALUES ('00135', '1', '78', '8', '2020-12-15 20:55:32', null);
INSERT INTO `book` VALUES ('00007', '三国演义', '现代出版社', '20', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00009', '大主宰', '华文出版社', '60', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00010', '完美世界', '人民出版社', '100', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00004', '数据库', '中国传媒大学出版社', '60', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00002', '树木培育', '南京大学出版社', '30', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00003', '水果栽培', '长江出版社', '50', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00006', '水浒传', '北京大学出版社', '90', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00001', '自然与科学', '北京大学出版社', '20', '2020-12-15 09:04:34', '文化类');
INSERT INTO `book` VALUES ('00005', '西游记', '中国电影出版社', '20', '2020-12-15 09:04:34', '文化类');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `no` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `uName` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(20) NOT NULL DEFAULT '',
  `uNo` varchar(20) NOT NULL,
  `uSex` varchar(2) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT current_timestamp(),
  `uPhonenumber` varchar(11) DEFAULT NULL,
  `uRole` varchar(20) DEFAULT '普通用户',
  PRIMARY KEY (`no`),
  UNIQUE KEY `uNo` (`uNo`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('001', '张三', 'abc123', '12345678912', '男', '2020-12-15 08:56:03', '12345678912', '管理员');
INSERT INTO `message` VALUES ('002', '李四', 'aaa123', '12345678911', '男', '2020-12-15 08:56:03', '12345678911', '普通用户');
INSERT INTO `message` VALUES ('003', '王五', 'bbb123', '12345678910', '男', '2020-12-15 08:56:03', '12345678910', '普通用户');
INSERT INTO `message` VALUES ('004', '李明', 'ppp123', '12345678921', '男', '2020-12-15 08:56:03', '12345678921', '普通用户');
INSERT INTO `message` VALUES ('005', '当然', 'aaa123', '12345678903', '男', '2020-12-15 08:56:03', '12345678903', '普通用户');
INSERT INTO `message` VALUES ('006', '平时', 'bbb123', '12345678958', '男', '2020-12-15 08:56:03', '12345678958', '普通用户');
INSERT INTO `message` VALUES ('007', '合格', 'abc123', '12345678998', '男', '2020-12-15 08:56:04', '12345678998', '普通用户');
INSERT INTO `message` VALUES ('008', '传递', 'aaa123', '12345678978', '男', '2020-12-15 08:56:04', '12345678978', '普通用户');
INSERT INTO `message` VALUES ('009', '王芳', 'bbb123', '12345678944', '男', '2020-12-15 08:56:04', '12345678944', '普通用户');
INSERT INTO `message` VALUES ('010', '天天', 'abc123', '12345678941', '男', '2020-12-15 08:56:04', '12345678941', '普通用户');
INSERT INTO `message` VALUES ('011', '力量', 'aaa123', '12345678962', '男', '2020-12-15 08:56:04', '12345678962', '普通用户');
INSERT INTO `message` VALUES ('012', '小红', 'bbb123', '12345678935', '男', '2020-12-15 08:56:04', '12345678935', '普通用户');
INSERT INTO `message` VALUES ('013', '易晓清', 'yxq123456', '17855608438', '女', '2020-12-15 09:38:42', null, '普通用户');
INSERT INTO `message` VALUES ('040', '胡杰', 'yxq123456', '17855608460', '女', '2020-12-15 10:31:08', null, '普通用户');
INSERT INTO `message` VALUES ('054', '12', 'ppp123', '17855608479', '女', '2020-12-15 17:02:51', null, '普通用户');
INSERT INTO `message` VALUES ('070', '汪苗', 'ppp123', '17855608879', '女', '2020-12-15 20:52:53', null, '普通用户');
