package ACCESSCODE;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OoooSmartClockTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	void test_dialog_equal_NULL_bycoverage() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//then
		Assertions.assertThrows(Exception.class, () -> ss.setTimeZone());
		
	}
	
	@Test
	void test_OoooSetTimeZoneDialog_show() {
		//given
		OoooSetTimeZoneDialog ss=new OoooSetTimeZoneDialog();
		
		//then
		assertEquals(0,ss.show());
	}
	
	@Test
	void test_put_dialog_into_setUpDialog_get_show_value_and_give_value_to_setTimeZone_into_zoneIndex_and_getTimeZone_expect_return_zoneIndex_equal_0() throws Exception {
		//given
		OoooSetTimeZoneDialog ostzd=new OoooSetTimeZoneDialog();
		OoooSmartClock ss=new OoooSmartClock();
		//when
		ss.setUpDialog(ostzd);
		ss.setTimeZone();
		//then
		assertEquals(0,ss.getTimeZone());
	}
	
	@Test
	void test_give_date_time_expect_return_same_date_time() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 22:22:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 22:22:22",ss.getCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_expect_return_time_type_YYYY_MM_dd_NOON() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 12:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_12_minut_equal_1_second_equal_0_expect_return_time_type_YYYY_MM_dd_NOON_bycoverage() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-11-25 12:01:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-11-25 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_12_minut_equal_0_second_equal_0_expect_return_time_type_YYYY_MM_dd_NOON_bycoverage() throws ParseException {//解noon的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-11-25 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-11-25 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_12_minut_equal_1_second_equal_1_expect_return_same_date_time_bycoverage() throws ParseException {//解noon的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-11-25 12:01:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-11-25 12:01:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_12_minut_equal_2_second_equal_1_expect_return_same_date_time_bycoverage() throws ParseException {//解noon的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-11-25 12:02:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-11-25 12:02:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_expect_return_YYYY_MM_dd_MIDNIGHT() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 MIDNIGHT",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_0_minut_equal_0_second_equal_1_expect_return_time_type_YYYY_MM_dd_MIDNIGHT_bycoverage() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 00:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 MIDNIGHT",ss.getLocalCurrentTimeStamp());
	}
	@Test
	void give_date_time_and_hour_equal_0_minut_equal_1_second_equal_0_expect_return_time_type_YYYY_MM_dd_MIDNIGHT_bycoverage() throws Exception {//解midnight的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 00:01:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 MIDNIGHT",ss.getLocalCurrentTimeStamp());
	}
	@Test
	void give_date_time_and_hour_equal_0_minut_equal_1_second_equal_1_expect_return_same_date_time_bycoverage() throws Exception {//解midnight的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 00:01:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 00:01:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_hour_equal_0_minut_equal_2_second_equal_1_expect_return_same_date_time_bycoverage() throws Exception {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-04-22 00:02:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-04-22 00:02:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_10_day_equal_10_expect_return_YYYY_MM_dd_DOUBLE_TEN_HH_mm_ss() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-10-10 11:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-10-10 DOUBLE-TEN 11:00:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_8_day_equal_8_expect_return_YYYY_MM_dd_FATHERS_DAY_HH_mm_ss() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-8-8 11:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-08-08 FATHER'S DAY 11:00:01",ss.getLocalCurrentTimeStamp());
	}
	
	
	@Test
	void give_date_time_and_month_equal_12_day_equal_25_expect_return_YYYY_MM_dd_X_MAS_HH_mm_ss() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-12-25 11:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-12-25 X'MAS 11:00:01",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_12_day_equal_25_hour_equal_12_minute_equal_0_second_equal_1_expect_return_YYYY_MM_dd_X_MAS_NOON() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-12-25 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-12-25 X'MAS NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_9_day_equal_10_expect_return_same_date_time_bycoverage() throws ParseException {//解國慶的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-09-10 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-09-10 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_10_day_equal_9_expect_return_same_date_time_bycoverage() throws ParseException {//解國慶的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-10-09 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-10-09 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_8_day_equal_7_expect_return_same_date_time_bycoverage() throws ParseException {
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-08-07 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-08-07 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_7_day_equal_8_expect_return_same_date_time_bycoverage() throws ParseException {//解父親節的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-07-08 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-07-08 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_12_day_equal_24_expect_return_same_date_time_bycoverage() throws ParseException {//解聖誕節的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-12-24 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-12-24 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	@Test
	void give_date_time_and_month_equal_11_day_equal_25_expect_return_same_date_time_bycoverage() throws ParseException {//解聖誕節的coverage
		//given
		OoooSmartClock ss=new OoooSmartClock();
		//when
		String dateString="2022-11-25 12:00:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateString);
		ss.setCurrentTime(date);
		//then
		assertEquals("2022-11-25 NOON",ss.getLocalCurrentTimeStamp());
	}
	
	
	

}
