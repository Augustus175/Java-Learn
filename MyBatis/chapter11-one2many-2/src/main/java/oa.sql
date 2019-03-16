/*
 Navicat MySQL Data Transfer

 Source Server         : localDB
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : oa

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 16/03/2019 06:58:18
*/

SET NAMES utf8mb4;
CREATE  database oa;
use oa;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES (1, 'USA');
INSERT INTO `country` VALUES (2, 'England');

-- ----------------------------
-- Table structure for minister
-- ----------------------------
DROP TABLE IF EXISTS `minister`;
CREATE TABLE `minister`  (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `countryId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of minister
-- ----------------------------
INSERT INTO `minister` VALUES (1, 'aaa', 1);
INSERT INTO `minister` VALUES (2, 'bbb', 1);
INSERT INTO `minister` VALUES (3, 'ccc', 1);
INSERT INTO `minister` VALUES (4, 'ddd', 2);
INSERT INTO `minister` VALUES (5, 'eee', 2);


SET FOREIGN_KEY_CHECKS = 1;
