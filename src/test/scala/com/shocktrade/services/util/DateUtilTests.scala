package com.shocktrade.services.util

import java.util.Calendar
import java.util.Date
import java.util.TimeZone
import org.apache.log4j.Logger
import org.junit.Test

/**
 * Date Utilities Test Suite
 * @author lawrence.daniels@gmail.com
 */
class DateUtilTests {
  val logger = Logger.getLogger(getClass())

  @Test
  def testIndicators() {
    logger.info("isTradingActive = %s".format(DateUtil.isTradingActive))
    logger.info("isAfterHours = %s".format(DateUtil.isAfterHours))
    logger.info("isWeekEnd = %s".format(DateUtil.isWeekEnd))
    logger.info("isDaylightSavings = %s".format(DateUtil.isDaylightSavings))
    logger.info("")
  }

  @Test
  def getLastTradeTime() {
    logger.info("last trading start time = %s".format(DateUtil.getLastTradeStartTime))
    logger.info("last trading end time = %s".format(DateUtil.getLastTradeStopTime))
    logger.info("")
  }

  @Test
  def getTradeTime() {
    logger.info("trading start time = %s".format(DateUtil.getTradeStartTime))
    logger.info("trading end time = %s".format(DateUtil.getTradeStopTime))
    logger.info("")
  }

  @Test
  def getNextTradeTime() {
    logger.info("next trading start time = %s".format(DateUtil.getNextTradeStartTime))
    logger.info("")
  }

  @Test
  def newYorkTime() {
    val cal = Calendar.getInstance()
    cal.setTimeZone(TimeZone.getTimeZone("US/New York"))
    logger.info("The time in New York is %s".format(cal.getTime()))
  }

}