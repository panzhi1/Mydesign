package com.example.alarmclock.common;

/**
 * Created by Administrator on 2018/1/22.
 */

public class AlarmClockCommon {

    /**
     * SharedPreferences属性信息文件
     */
    public static final String EXTRA_AC_SHARE = "extra_ac_shared_preferences_file";

    /**
     * 保存的壁纸key
     */
    public static final String WALLPAPER_NAME = "wallpaper_name";

    /**
     * 保存的壁纸value
     */
    public static final String DEFAULT_WALLPAPER_NAME = "wallpaper_0";

    /**
     * 保存的壁纸地址
     */
    public static final String WALLPAPER_PATH = "wallpaper_path";

    /**
     * 默认闹铃小时
     */
    public static final String DEFAULT_ALARM_HOUR = "default_alarm_hour";

    /**
     * 默认闹铃分钟
     */
    public static final String DEFAULT_ALARM_MINUTE = "default_alarm_minute";

    /**
     * 保存的闹钟铃声音量
     */
    public static final String AlARM_VOLUME = "alarm_volume";

    /**
     * 铃声名
     */
    public static final String RING_NAME = "ring_name";

    /**
     * 保存的AlarmClock单例
     */
    public static final String ALARM_CLOCK = "alarm_clock";

    /**
     * 铃声地址
     */
    public static final String RING_URL = "ring_url";

    /**
     * 铃声选择界面位置
     */
    public static final String RING_PAGER = "ring_pager_position";

    /**
     * 请求的铃声选择类型：0，闹钟；1，计时器
     */
    public static final String RING_REQUEST_TYPE = "ring_request_type";

    /**
     * 保存计时器的铃声名
     */
    public static final String RING_NAME_TIMER = "ring_name_timer";

    /**
     * 保存计时器的铃声地址
     */
    public static final String RING_URL_TIMER = "ring_url_timer";

    /**
     * 保存计时器的铃声选择界面位置
     */
    public static final String RING_PAGER_TIMER = "ring_pager_position_timer";

    /**
     * 默认铃声Url标记
     */
    public static final String DEFAULT_RING_URL = "default_ring_url";

    /**
     * 无铃声Url标记
     */

    public static final String NO_RING_URL = "no_ring_url";

    /**
     * 小睡重复次数
     */
    public static final String NAP_TIMES = "nap_times";

    /**
     * 小睡已执行次数
     */
    public static final String NAP_RAN_TIMES = "nap_ran_times";

    /**
     * 小睡间隔
     */
    public static final String NAP_INTERVAL = "nap_interval";

    /**
     * 最大录音时常10分钟
     */
    public static final int MAX_RECORD_LENGTH = 1000 * 60 * 10;

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 详情
     */
    public static final String DETAIL = "detail";

    /**
     * 取消按钮文字
     */
    public static final String CANCEL_TEXT = "cancel_text";

    /**
     * 确定按钮文字
     */
    public static final String SURE_TEXT = "sure_text";

    /**
     * 时间
     */
    public static final String TIME = "time";

    /**
     * base64编码
     */
    public static final String BASE64 = "base64";

    /**
     * 倒计时时间
     */
    public static final String COUNTDOWN_TIME = "countdown_time";

    /**
     * 倒计时是否为停止状态
     */
    public static final String IS_STOP = "is_stop";

    /**
     * 录音文件存放地址
     */
    public static final String RECORD_SAVE_PATH = "/WeaAlarmClock/audio/record";

    /**
     * 自定义壁纸存放地址
     */
    public static final String DIY_WALLPAPER_PATH = "/wallpaper/theme.jpg";

    /**
     * 闹钟不响可能原因提示
     */
    public static final String ALARM_CLOCK_EXPLAIN = "alarm_clock_explain";

    public static final String SHAKE_RETRIEVE_AC = "shake_retrieve_ac";
}
