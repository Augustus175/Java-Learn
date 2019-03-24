/*
 Navicat MySQL Data Transfer

 Source Server         : localDB
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : oa2

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 16/03/2019 23:33:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cource
-- ----------------------------
DROP TABLE IF EXISTS `cource`;
CREATE TABLE `cource`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cource
-- ----------------------------
INSERT INTO `cource` VALUES (1, 'JavaSE');
INSERT INTO `cource` VALUES (2, 'JavaEE');
INSERT INTO `cource` VALUES (3, 'Android');

-- ----------------------------
-- Table structure for middle
-- ----------------------------
DROP TABLE IF EXISTS `middle`;
CREATE TABLE `middle`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) NULL DEFAULT NULL,
  `courseId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of middle
-- ----------------------------
INSERT INTO `middle` VALUES (1, 1, 1);
INSERT INTO `middle` VALUES (2, 1, 2);
INSERT INTO `middle` VALUES (3, 2, 1);
INSERT INTO `middle` VALUES (4, 2, 3);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张三');
INSERT INTO `student` VALUES (2, '李四');

SET FOREIGN_KEY_CHECKS = 1;
