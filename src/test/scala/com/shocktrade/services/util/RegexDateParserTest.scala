package com.shocktrade.services.util

import org.junit.Test
import org.apache.log4j.Logger
import com.shocktrade.services.util.RegexDateParser._

class RegexDateParserTest {
  val logger = Logger.getLogger(getClass())

  @Test
  def test_DD_MMM_YYYY() {
    logger.info(s"date = ${parseDate("28-MAY-1984")}")
  }

  @Test
  def test_MM_DD_YYYY() {
    logger.info(s"date = ${parseDate("12-23-1969")}")
    logger.info(s"date = ${parseDate("12/30/2011")}")
  }

  @Test
  def test_YYYY_MM_DD() {
    logger.info(s"date = ${parseDate("2012-12-19")}")
    logger.info(s"date = ${parseDate("2013/12/19")}")
  }

  @Test
  def test_YYYY_MM_DD_HHMMSS() {
    logger.info(s"date = ${parseDate("2011-02-11 10:12:11")}")
  }

}