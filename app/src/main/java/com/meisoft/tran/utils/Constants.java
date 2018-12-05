package com.meisoft.tran.utils;

/**
 * Created by Administrator on 2018-01-13.
 */

public class Constants {
    //public final static String SERVER_URL = "http://183.60.156.55:8888";
    public final static String SERVER_URL = "http://120.77.202.2:80";
    public final static String SERVER_URL1= "http://120.77.202.2:80";
    //public final static String SERVER_URL1= "http://120.77.212.92:8086";
    public final static String CES_URL1= "http://172.16.244.1:80";
    public final static String BENDI = "http://192.168.2.104/meisoft-audit";
    //测试端口.车辆派遣
    public static final String CARDISPATCH_CS="/app/assign/saveOrUpdate";
    //测试
    public static final String CITYLIST1_CS="/meisoft-audit/app/city/list";

    //图片地址
    public static final String IMAGE = "/carFile";

    /** 货主登录 */
    public static final String LOGIN = "/carApp-server/bas/staff/login";
    public static final String LOGIN1 = "/client/app/user/login";

    /** 注册 */
    public static final String  REGIST= "/carApp-server/bas/driver/register";

    /** 找货列表 */

    public static final String DRIVERLIST="/carApp-server/bas/order/list";

    /** 车长列表 */
    public static final String CARLENGTHLIST="/carApp-server/bas/carlenght/list";

    /** 车型列表 */
    public static final String CARTYPELIST="/carApp-server/bas/cartype/list";


    public static final String CARTYPE_LIST="/client/app/cartype/list";
    /**
     * 费用项目
     */
    public static final String ITEM_CODE_LIST="/client/app/otherItem/list";

    /** 省份列表 */
    public static final String PROVINCELIST="/carApp-server/bas/province/list";

    /** 城市列表 */
    public static final String CITYLIST="/carApp-server/bas/city/list";
    /** 城市列表 */
    public static final String CITYLIST1="/client/app/city/list";


    /** 区域列表 */
    public static final String AREALIST="/carApp-server/bas/area/list";

    /** 消息列表 */
    public static final String PUSHLIST="/carApp-server/push/driver/list";

    /** 消息详细信息，货源详细信息 */
    public static final String PUSHDETAIL="/carApp-server/bas/order/detail";

    /** 提交报价 */
    public static final String ORDERPRICE="/carApp-server/bas/orderprice/add";

    /** 拖挂轮轴 */
    public static final String CARAXLELIST="/carApp-server/bas/caraxle/list";

    /** 车辆轴数 */
    public static final String CARAXISLIST="/carApp-server/bas/caraxis/list";

    /** 车厢体积 */
    public static final String VOLUMESLIST="/carApp-server/bas/carbox/volumes";

    /** 车厢长度 */
    public static final String LENGTHSLIST="/carApp-server/bas/carbox/lengths";

    /** 车辆品牌 */
    public static final String CARBRAND="/carApp-server/bas/carbrand/list";

    /** 车辆发动机 */
    public static final String CARENGINE="/carApp-server/bas/carengine/list";

    /** 更新司机信息 */
    public static final String DRIVERUPDATE="/carApp-server/bas/driver/update";

    /** 保存车辆信息 */
    public static final String CARADD="/carApp-server/bas/car/add";

    /** 更新车辆信息 */
    public static final String CARUPDATE="/carApp-server/bas/car/update";

    /** 获取司机详细信息 */
    public static final String GETDRIVERINFO="/carApp-server/bas/driver/get";

    /** 获取车辆详情信息 */
    public static final String GETCARINFO="/carApp-server/bas/car/get";

    /** 获取车辆信息完成度 */
    public static final String CHECK="/carApp-server/bas/driver/check";

    /** 头像上传地址 */
    public static final String HEADIMG = "/carApp-server/car/file/headimg";

    /** 驾照上传地址 */
    public static final String LICENSEIMG = "/carApp-server/car/file/licenseimg";

    public static final String CARIMG = "/carApp-server/car/file/carimg";
    /**
     * 货单上传地址
     */
    public static final String ORDER = "/images";

    /** 计划录入 */
    public static final String PLAN_ORDER= "/client/app/plan/saveOrUpdate";
    /** 发布货源 */
    public static final String PUBLISHGOODS = "/carApp-server/bas/order/add";

    /** 获取包装信息 */
//	public static final String PACKAGELIST = "/carApp-server/bas/package/list";
    public static final String PACKAGELIST = "/client/app/package/list";

    /** 装货方式 */
    public static final String LOADSTYLE = "/carApp-server/bas/loadstyle/list";

    /** 结算方式 */
    public static final String PAYSTYLE = "/carApp-server/bas/paystyle/list";

    /** 获取货物名称列表 */
//	public static final String GOODSLIST = "/carApp-server/bas/goods/list";
    /** 获取货物名称列表 */
    public static final String GOODSLIST = "/client/app/basgoods/list";

    /** 货主发布货源列表 */
    public static final String STAFFLIST="/carApp-server/bas/order/staff/list";


    public static final String INTENT_TRANS_DATA = "data";


    /** 百度推送key */
    public static final String PUSH_LOGIN_TYPE_API_KEY = "8AYXe07YSazPB9puiHadaX5N";
    /**图片轮播地址*/
    public static final String IMAGE_1="images/1.png";
    public static final String IMAGE_2="images/2.png";
    public static final String IMAGE_3="images/3.png";
    /**物流管理中图片*/
    public static final String LOGISTICS="images/4.png";
    /**现场发运中的图片 **/
    public static final String SHIPMENT_IMAGE_1="images/shipment_1.png";
    public static final String SHIPMENT_IMAGE_2="images/shipment_2.png";
    public static final String SHIPMENT_IMAGE_3="images/shipment_3.png";
    /**计划中的广告图片**/
    public static final String PLANENTRY_IMAGE_1="images/planentry_1.png";
    public static final String PLANENTRY_IMAGE_2="images/planentry_2.png";
    public static final String PLANENTRY_IMAGE_3="images/planentry_3.png";
    /**计划分流中的广告图片**/
    public static final String SHUNT_IMAGE_1="images/shunt_1.png";
    public static final String SHUNT_IMAGE_2="images/shunt_2.png";
    public static final String SHUNT_IMAGE_3="images/shunt_3.png";

    /**车辆派遣中的广告图片**/
    public static final String CARDISPATCH_IMAGE_1="images/car_dispatch_1.png";
    public static final String CARDISPATCH_IMAGE_2="images/car_dispatch_2.png";
    public static final String CARDISPATCH_IMAGE_3="images/car_dispatch_3.png";
    /**成本审核中的广告图片**/
    public static final String COST_CHECK_1="images/cost_check_1.png";
    public static final String COST_CHECK_2="images/cost_check_2.png";
    public static final String COST_CHECK_3="images/cost_check_3.png";
    /**车辆询价中的广告图片**/
    public static final String CARINQUIRY_IMAGE_1="images/car_inquiry_1.png";
    public static final String CARINQUIRY_IMAGE_2="images/car_inquiry_2.png";
    public static final String CARINQUIRY_IMAGE_3="images/car_inquiry_3.png";
    /**在途跟踪中的广告图片**/
    public static final String ROAD_TRACKING_1="images/road_track_1.png";
    public static final String ROAD_TRACKING_2="images/road_track_2.png";
    public static final String ROAD_TRACKING_3="images/road_track_3.png";
    /**回单管理中的广告图片**/
    public static final String RECEIPT_MANAGER_1="images/receipt_manager_1.png";
    public static final String RECEIPT_MANAGER_2="images/receipt_manager_2.png";
    public static final String RECEIPT_MANAGER_3="images/receipt_manager_3.png";
    /**计划接口**/
    public static final String PLAN_ORDER_LIST="/client/app/plan/list";
    public static final String PLAN_ORDER_DETAIL="/client/app/plan/get";
    /**
     * 计划分流接口
     */
    public static final String SHUNT_ORDER_LIST="/client/app/shunt/list";
    public static final String SHUNT_ORDER="/client/app/shunt/update";
    /**
     * 承运商接口
     */
    public static final String SUPPLIER="/client/app/supplier/list";
    //测试
    public static final String SUPPLIER_CS="/meisoft-audit/app/supplier/list";
    /**
     * 整车车辆派遣接口
     */
    public static final String CARDISPATCH_LIST="/client/app/assign/list";
    public static final String CARDISPATCH_DETAIL="/client/app/assign/getHD";
    public static final String CARDISPATCH="/client/app/assign/saveOrUpdate";
    public static final String CARDISPATCH_SURE="/client/app/assign/comfirt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_PLAN_LIST="/client/app/assign/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_PLAN_ADD="/client/app/assign/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_PLAN_DELETE="/client/app/assign/delDt";
    /**
     * 自提车辆派遣接口
     */

    public static final String CARDISPATCH_SUPPLIERCAR_LIST="/client/app/suppliercar/list";
    public static final String CARDISPATCH_SUPPLIERCAR_DETAIL="/client/app/suppliercar/getHD";
    public static final String CARDISPATCH_SUPPLIERCAR="/client/app/suppliercar/saveOrUpdate";
    public static final String CARDISPATCH_SUPPLIERCAR_SURE="/client/app/suppliercar/comfirt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_SUPPLIERCAR_PLAN_LIST="/client/app/suppliercar/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_SUPPLIERCAR_PLAN_ADD="/client/app/suppliercar/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_SUPPLIERCAR_PLAN_DELETE="/client/app/suppliercar/delDt";

    /**
     * 中转派遣接口
     */

    public static final String CARDISPATCH_ZHUANCAR_LIST="/client/app/zhuancar/list";
    public static final String CARDISPATCH_ZHUANCAR_DETAIL="/client/app/zhuancar/getHD";
    public static final String CARDISPATCH_ZHUANCAR="/client/app/zhuancar/saveOrUpdate";
    public static final String CARDISPATCH_ZHUANCAR_SURE="/client/app/zhuancar/comfirt";


    /**
     * 中转短波派遣接口
     */

    public static final String CARDISPATCH_MIDOUTCAR_LIST="/client/app/midoutcar/list";
    public static final String CARDISPATCH_MIDOUTCAR_DETAIL="/client/app/midoutcar/getHD";
    public static final String CARDISPATCH_MIDOUTCAR="/client/app/midoutcar/saveOrUpdate";
    public static final String CARDISPATCH_MIDOUTCAR_SURE="/client/app/midoutcar/comfirt";
    public static final String CARDISPATCH_MIDOUTCAR_PLAN_LIST="/client/app/midoutcar/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_MIDOUTCAR_PLAN_ADD="/client/app/midoutcar/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_MIDOUTCAR_PLAN_DELETE="/client/app/midoutcar/delDt";
    /**
     * 中转自提派遣接口
     */

    public static final String CARDISPATCH_MIDOWNERCAR_LIST="/client/app/midownercar/list";
    public static final String CARDISPATCH_MIDOWNERCAR_DETAIL="/client/app/midownercar/getHD";
    public static final String CARDISPATCH_MIDOWNERCAR="/client/app/midownercar/saveOrUpdate";
    public static final String CARDISPATCH_MIDOWNERCAR_SURE="/client/app/midownercar/comfirt";
    public static final String CARDISPATCH_MIDOWNERCAR_PLAN_LIST="/client/app/midownercar/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_MIDOWNERCAR_PLAN_ADD="/client/app/midownercar/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_MIDOWNERCAR_PLAN_DELETE="/client/app/midownercar/delDt";


    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_ZHUANCAR_PLAN_LIST="/client/app/zhuancar/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_ZHUANCAR_PLAN_ADD="/client/app/zhuancar/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_ZHUANCAR_PLAN_DELETE="/client/app/zhuancar/delDt";


    /**
     * 直发短拨派遣接口
     */

    public static final String CARDISPATCH_OUTCAR_LIST="/client/app/outcar/list";
    public static final String CARDISPATCH_OUTCAR_DETAIL="/client/app/outcar/getHD";
    public static final String CARDISPATCH_OUTCAR="/client/app/outcar/saveOrUpdate";
    public static final String CARDISPATCH_OUTCAR_SURE="/client/app/outcar/comfirt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_OUTCAR_PLAN_LIST="/client/app/outcar/getDt";
    /**
     * 车辆派遣中添加计划单接口
     */
    public static final String CARDISPATCH_OUTCAR_PLAN_ADD="/client/app/outcar/addDt";
    /**
     * 车辆派遣中删除计划单接口
     */
    public static final String CARDISPATCH_OUTCAR_PLAN_DELETE="/client/app/outcar/delDt";



    /**
     * 成本审核
     */
    public static final String COST_CHECK_LIST="/client/app/costcheck/list";
    public static final String COST_CHECK_DETAIL="/client/app/costcheck/get";
    public static final String COST_CHECK="/client/app/costcheck/check";
    //成本审核中打回功能
    public static final String REPULSE="/client/app/costcheck/repulse";
    //测试接口
    public static final String CARDISPATCH_PLAN_LIST_1="/app/assign/getDt";
    //现场发运员
    public static final String LOADERCODE="/client/app/sysuser/list";
    /**
     * 发货单位
     */
    public static final String CUSTOMER_LIST="/client/app/customer/list";
    /**
     * 收货单位
     */
    public static final String RCOMPANY_LIST="/client/app/company/list";
    /**
     * 现场发运未出场
     */
    public static final String SHIPMENT_NO_OUT_LIST="/client/app/onspot/list_no_out";
    /**
     * 现场发运已出场
     */
    public static final String SHIPMENT_OUT_LIST="/client/app/onspot/list_out";
    public static final String SHIPMENT_DETAIL="/client/app/onspot/get";
    public static final String ADJUST_AMT="/client/app/onspot/adjust";
    //调整审核列表
    public static final String ADJUST_CHECK_LIST="/client/app/adjustcheck/list";
    public static final String ADJUST_DETAIL="/client/app/adjustcheck/get";
    public static final String ADJUST_CHECK_CHECK="/client/app/adjustcheck/check";

    /**
     * 资料审核
     */
    public static final String VERIFICATION_LIST="/client/app/onspotcheck/list";
    public static final String VERIFICATION_DETAIL="/client/app/onspotcheck/get";
    public static final String VERIFICATION="/client/app/onspotcheck/check";
    //入场接口
    public static final String APPROACH="/client/app/onspot/approach";
    //出场接口
    public static final String APPEARANCE="/client/app/onspot/appearance";
    /**
     * 图片上传地址1. 客户订单2. 司机合同3. 人货车照片
     */
    public static final String ASSIGNPHOTO="/client/app/onspot/assignphoto";
    /**
     * 上传存放车辆证件
     */
    public static final String CAR_PHOTO="/client/app/onspot/carphoto";
    /**
     * 在途跟踪列表接口
     */
    public static final String ROADTRACKINGLIST="/client/app/trace/list";
    /**
     * 在途跟踪详情
     */
    public static final String ROADTRACKING_DETAIL="/client/app/trace/detail";
    /**
     * 回单查询
     */
    public static final String RETURN_List="/client/app/return/list";
    /**
     * 回单详情
     *
     */
    public static final String RETURN_DETAIL="/client/app/return/get";
    /**
     * 回单拍照
     */
    public static final String RETURN_PHOTO="/client/app/return/photo";
    /**
     * 签收状态接口
     */
    public static final String MARK_STATUS="/client/app/baditem/list";
    /**
     * 签收接口
     */
    public static final String MARK="/client/app/return/mark";
    /**
     * 审批接口
     */
    public static final String INSTITUTION="/client/mobile/stream/init";

}
