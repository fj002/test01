package com.meisoft.tran.bean;

import java.io.Serializable;
import java.util.List;

public class PlatOrderDto implements Serializable {
	private String customerCode; // 发货单位
	private String pickRexman;// 
	private String pickPhone;// 联系电话
	private String companyName; // 收货单位
	private String rexman;// 
	private String phone;// 联系电话
	private String orderDate;// 装车日期
	private String startCity;// 
	private String startCityName;// 
	private String pickAddress;// 提货地址
	private String aimsCity; // 
	private String aimsCityName; //
	private String address; // 收货地址
	private String assignNo; // 送货单号
	private String goodsName;// 货物名称
	private Float qty;// 货物数量
	private Float weight; // 货物重量
	private Float volume;// 货物体积
	private String packageCode;// 货物包装id
	private String loaderName;
	private String lastUpdateBy;
	private String lastUpdateDate;
	private String supplierName;
	private String baditemName;// 签收状�??
	private String realSendtime;// 发车日期
	private String onspotcheckStatus;
	private float adjustAmt;//调整金额
	private String adjustRemark;//调整原因
	private String costadjustcheckStatus;//调整状�?? 1未审�?2已审�?
	private String type;//派车类型
	private String deliveryType;//运输类型 1整车2零担
	private String employee_name;//调度人员


	

	@Override
	public String toString() {
		return "PlatOrderDto [customerCode=" + customerCode + ", pickRexman="
				+ pickRexman + ", pickPhone=" + pickPhone + ", companyName="
				+ companyName + ", rexman=" + rexman + ", phone=" + phone
				+ ", orderDate=" + orderDate + ", startCity=" + startCity
				+ ", startCityName=" + startCityName + ", pickAddress="
				+ pickAddress + ", aimsCity=" + aimsCity + ", aimsCityName="
				+ aimsCityName + ", address=" + address + ", assignNo="
				+ assignNo + ", goodsName=" + goodsName + ", qty=" + qty
				+ ", weight=" + weight + ", volume=" + volume
				+ ", packageCode=" + packageCode + ", loaderName=" + loaderName
				+ ", lastUpdateBy=" + lastUpdateBy + ", lastUpdateDate="
				+ lastUpdateDate + ", supplierName=" + supplierName
				+ ", baditemName=" + baditemName + ", realSendtime="
				+ realSendtime + ", onspotcheckStatus=" + onspotcheckStatus
				+ ", adjustAmt=" + adjustAmt + ", adjustRemark=" + adjustRemark
				+ ", costadjustcheckStatus=" + costadjustcheckStatus
				+ ", type=" + type + ", deliveryType=" + deliveryType
				+ ", employee_name=" + employee_name + ", tranOrderCode="
				+ tranOrderCode + ", custNo=" + custNo + ", billCount="
				+ billCount + ", source=" + source + ", billPage=" + billPage
				+ ", markDate=" + markDate + ", markBy=" + markBy
				+ ", markStatus=" + markStatus + ", realCount=" + realCount
				+ ", realPage=" + realPage + ", baditemCode=" + baditemCode
				+ ", clientDate=" + clientDate + ", markQty=" + markQty
				+ ", clientBy=" + clientBy + ", markRemark=" + markRemark
				+ ", siteName=" + siteName + ", orderPhotos=" + orderPhotos
				+ ", packageName=" + packageName + ", helpAmt=" + helpAmt
				+ ", remark=" + remark + ", planCode=" + planCode
				+ ", siteCode=" + siteCode + ", customerName=" + customerName
				+ ", planEnterDate=" + planEnterDate + ", carCode=" + carCode
				+ ", driverName=" + driverName + ", mobile=" + mobile
				+ ", oilAmt=" + oilAmt + ", totalAmt=" + totalAmt
				+ ", prsettleAmt=" + prsettleAmt + ", ovsettleAmt="
				+ ovsettleAmt + ", carType=" + carType + ", offerPrice="
				+ offerPrice + ", arriveAmt=" + arriveAmt + ", monthAmt="
				+ monthAmt + ", status=" + status + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", assignCode=" + assignCode
				+ ", customerOrderPhotos=" + customerOrderPhotos
				+ ", driverPhotos=" + driverPhotos + ", personCarPhotos="
				+ personCarPhotos + ", idCardZfaceCarPhoto="
				+ idCardZfaceCarPhoto + ", idCardFfaceCarPhoto="
				+ idCardFfaceCarPhoto + ", drivingZfaceCarPhoto="
				+ drivingZfaceCarPhoto + ", drivingFfaceCarPhoto="
				+ drivingFfaceCarPhoto + ", taxiZfaceCarPhoto="
				+ taxiZfaceCarPhoto + ", taxiFfaceCarPhoto="
				+ taxiFfaceCarPhoto + ", policyZfaceCarPhoto="
				+ policyZfaceCarPhoto + ", policyFfaceCarPhoto="
				+ policyFfaceCarPhoto + ", otherZfaceCarPhoto="
				+ otherZfaceCarPhoto + ", otherFfaceCarPhoto="
				+ otherFfaceCarPhoto + ", assignDetails=" + assignDetails + "]";
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCostadjustcheckStatus() {
		return costadjustcheckStatus;
	}

	public void setCostadjustcheckStatus(String costadjustcheckStatus) {
		this.costadjustcheckStatus = costadjustcheckStatus;
	}

	public float getAdjustAmt() {
		return adjustAmt;
	}

	public void setAdjustAmt(float adjustAmt) {
		this.adjustAmt = adjustAmt;
	}

	public String getAdjustRemark() {
		return adjustRemark;
	}

	public void setAdjustRemark(String adjustRemark) {
		this.adjustRemark = adjustRemark;
	}

	public String getOnspotcheckStatus() {
		return onspotcheckStatus;
	}

	public void setOnspotcheckStatus(String onspotcheckStatus) {
		this.onspotcheckStatus = onspotcheckStatus;
	}

	public String getRealSendtime() {
		return realSendtime;
	}

	public void setRealSendtime(String realSendtime) {
		this.realSendtime = realSendtime;
	}

	public String getBaditemName() {
		return baditemName;
	}

	public void setBaditemName(String baditemName) {
		this.baditemName = baditemName;
	}

	public float getBillCount() {
		return billCount;
	}

	public void setBillCount(float billCount) {
		this.billCount = billCount;
	}

	public float getBillPage() {
		return billPage;
	}

	public void setBillPage(float billPage) {
		this.billPage = billPage;
	}

	public float getRealCount() {
		return realCount;
	}

	public void setRealCount(float realCount) {
		this.realCount = realCount;
	}

	public float getRealPage() {
		return realPage;
	}

	public void setRealPage(float realPage) {
		this.realPage = realPage;
	}

	public float getMarkQty() {
		return markQty;
	}

	public void setMarkQty(float markQty) {
		this.markQty = markQty;
	}

	public String getMarkDate() {
		return markDate;
	}

	public void setMarkDate(String markDate) {
		this.markDate = markDate;
	}

	public String getMarkBy() {
		return markBy;
	}

	public void setMarkBy(String markBy) {
		this.markBy = markBy;
	}

	public String getBaditemCode() {
		return baditemCode;
	}

	public void setBaditemCode(String baditemCode) {
		this.baditemCode = baditemCode;
	}

	public String getClientDate() {
		return clientDate;
	}

	public void setClientDate(String clientDate) {
		this.clientDate = clientDate;
	}

	public String getClientBy() {
		return clientBy;
	}

	public void setClientBy(String clientBy) {
		this.clientBy = clientBy;
	}

	public String getMarkRemark() {
		return markRemark;
	}

	public void setMarkRemark(String markRemark) {
		this.markRemark = markRemark;
	}

	public List<OrderPhotos> getOrderPhotos() {
		return orderPhotos;
	}

	public void setOrderPhotos(List<OrderPhotos> orderPhotos) {
		this.orderPhotos = orderPhotos;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getTranOrderCode() {
		return tranOrderCode;
	}

	public void setTranOrderCode(String tranOrderCode) {
		this.tranOrderCode = tranOrderCode;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMarkStatus() {
		return markStatus;
	}

	public void setMarkStatus(String markStatus) {
		this.markStatus = markStatus;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	// 回单信息
	private String tranOrderCode;
	private String custNo;
	private float billCount;
	private String source;// 网点
	private float billPage;
	private String markDate;
	private String markBy;
	private String markStatus;// 是否回单
	private float realCount;
	private float realPage;
	private String baditemCode;
	private String clientDate;
	private float markQty;
	private String clientBy;
	private String markRemark;
	private String siteName;
	private List<OrderPhotos> orderPhotos;// 回单照片

	public class OrderPhotos implements Serializable {
		private String createDate;
		private String createBy;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;
		private String tranOrderCode;

		@Override
		public String toString() {
			return "OrderPhotos [createDate=" + createDate + ", createBy="
					+ createBy + ", filePath=" + filePath + ", fileName="
					+ fileName + ", assignCode=" + assignCode + ", photoCode="
					+ photoCode + ", tranOrderCode=" + tranOrderCode + "]";
		}

		public String getTranOrderCode() {
			return tranOrderCode;
		}

		public void setTranOrderCode(String tranOrderCode) {
			this.tranOrderCode = tranOrderCode;
		}

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	private String packageName;// 货物包装
	private Float helpAmt;// 代收货款
	private String remark;// 详细备注
	private String planCode;// 修改时必�?
	private String siteCode;// 登录用户部门编码
	// 车辆派遣
	private String customerName;// 客户名称
	private String planEnterDate;// 预计到车时间
	private String carCode;// 车牌�?
	private String driverName;// 司机名称
	private String mobile;// 司机电话
//	private String diaocheBy;// 调车�?
	private float oilAmt;// 油卡金额
	private float totalAmt;// 运费总额
	private float prsettleAmt;// 预付金额
	private float ovsettleAmt;// 回单金额
	private String carType;// 车辆类型
	private float offerPrice;//报价，后期修�?

	public float getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public float getMonthAmt() {
		return monthAmt;
	}

	public void setMonthAmt(float monthAmt) {
		this.monthAmt = monthAmt;
	}

	private float arriveAmt;// 到付金额
	private float monthAmt;// 月结余额
	private String status;
	private String createBy;
	private String createDate;
	private String assignCode;// 派车单号

	// 图片类字�?

	public class CustomerOrderPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "CustomerOrderPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private List<CustomerOrderPhoto> customerOrderPhotos;// 客户订单

	/**
	 * 司机合同
	 * 
	 * @author Administrator
	 *
	 */
	public class DriverPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "DriverPhoto [createDate=" + createDate + ", createBy="
					+ createBy + ", type=" + type + ", filePath=" + filePath
					+ ", fileName=" + fileName + ", assignCode=" + assignCode
					+ ", photoCode=" + photoCode + "]";
		}
	}

	private List<DriverPhoto> driverPhotos;// 司机合同

	private List<PersonCarPhoto> personCarPhotos;// 人货车照�?

	public List<CustomerOrderPhoto> getCustomerOrderPhotos() {
		return customerOrderPhotos;
	}

	public void setCustomerOrderPhotos(
			List<CustomerOrderPhoto> customerOrderPhotos) {
		this.customerOrderPhotos = customerOrderPhotos;
	}

	public List<DriverPhoto> getDriverPhotos() {
		return driverPhotos;
	}

	public void setDriverPhotos(List<DriverPhoto> driverPhotos) {
		this.driverPhotos = driverPhotos;
	}

	public List<PersonCarPhoto> getPersonCarPhotos() {
		return personCarPhotos;
	}

	public void setPersonCarPhotos(List<PersonCarPhoto> personCarPhotos) {
		this.personCarPhotos = personCarPhotos;
	}

	/**
	 * 人货车照�?
	 * 
	 * @author Administrator
	 *
	 */
	public class PersonCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "PersonCarPhoto [createDate=" + createDate + ", createBy="
					+ createBy + ", type=" + type + ", filePath=" + filePath
					+ ", fileName=" + fileName + ", assignCode=" + assignCode
					+ ", photoCode=" + photoCode + "]";
		}
	}

	private IdCardZfaceCarPhoto idCardZfaceCarPhoto;// 身份证正�?

	public IdCardZfaceCarPhoto getIdCardZfaceCarPhoto() {
		return idCardZfaceCarPhoto;
	}

	public void setIdCardZfaceCarPhoto(IdCardZfaceCarPhoto idCardZfaceCarPhoto) {
		this.idCardZfaceCarPhoto = idCardZfaceCarPhoto;
	}

	/**
	 * 身份证正�?
	 * 
	 * @author Administrator
	 *
	 */
	public class IdCardZfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "IdCardZfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private IdCardFfaceCarPhoto idCardFfaceCarPhoto;// 身份证反�?

	public IdCardFfaceCarPhoto getIdCardFfaceCarPhoto() {
		return idCardFfaceCarPhoto;
	}

	public void setIdCardFfaceCarPhoto(IdCardFfaceCarPhoto idCardFfaceCarPhoto) {
		this.idCardFfaceCarPhoto = idCardFfaceCarPhoto;
	}

	/**
	 * 身份证反�?
	 * 
	 * @author Administrator
	 *
	 */
	public class IdCardFfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}
	}

	private DrivingZfaceCarPhoto drivingZfaceCarPhoto;// 行驶证正�?

	public DrivingZfaceCarPhoto getDrivingZfaceCarPhoto() {
		return drivingZfaceCarPhoto;
	}

	public void setDrivingZfaceCarPhoto(
			DrivingZfaceCarPhoto drivingZfaceCarPhoto) {
		this.drivingZfaceCarPhoto = drivingZfaceCarPhoto;
	}

	/**
	 * 行驶证正�?
	 * 
	 * @author Administrator
	 *
	 */
	public class DrivingZfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}
	}

	private DrivingFfaceCarPhoto drivingFfaceCarPhoto;// 行驶证反�?

	/**
	 * 行驶证反�?
	 * 
	 * @author Administrator
	 *
	 */
	public class DrivingFfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "DrivingFfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private TaxiZfaceCarPhoto taxiZfaceCarPhoto;// 营运证正�?

	/**
	 * 营运证正�?
	 * 
	 * @author Administrator
	 *
	 */
	public class TaxiZfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}
	}

	private TaxiFfaceCarPhoto taxiFfaceCarPhoto;// 营运证反�?

	public DrivingFfaceCarPhoto getDrivingFfaceCarPhoto() {
		return drivingFfaceCarPhoto;
	}

	public void setDrivingFfaceCarPhoto(
			DrivingFfaceCarPhoto drivingFfaceCarPhoto) {
		this.drivingFfaceCarPhoto = drivingFfaceCarPhoto;
	}

	public TaxiZfaceCarPhoto getTaxiZfaceCarPhoto() {
		return taxiZfaceCarPhoto;
	}

	public void setTaxiZfaceCarPhoto(TaxiZfaceCarPhoto taxiZfaceCarPhoto) {
		this.taxiZfaceCarPhoto = taxiZfaceCarPhoto;
	}

	public TaxiFfaceCarPhoto getTaxiFfaceCarPhoto() {
		return taxiFfaceCarPhoto;
	}

	public void setTaxiFfaceCarPhoto(TaxiFfaceCarPhoto taxiFfaceCarPhoto) {
		this.taxiFfaceCarPhoto = taxiFfaceCarPhoto;
	}

	/**
	 * 营运证反�?
	 * 
	 * @author Administrator
	 *
	 */
	public class TaxiFfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "TaxiFfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private PolicyZfaceCarPhoto policyZfaceCarPhoto;// 保险�?(�?) 正面

	/**
	 * 保险�?(�?) 正面
	 * 
	 * @author Administrator
	 *
	 */
	public class PolicyZfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "PolicyZfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private PolicyFfaceCarPhoto policyFfaceCarPhoto;// 保险�?(�?) 反面

	/**
	 * 保险�?(�?) 反面
	 * 
	 * @author Administrator
	 *
	 */
	public class PolicyFfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "PolicyFfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}
	}

	private OtherZfaceCarPhoto otherZfaceCarPhoto;// 其它证件正面

	/**
	 * 其它证件正面
	 * 
	 * @author Administrator
	 *
	 */
	public class OtherZfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "OtherZfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}

	}

	private OtherFfaceCarPhoto otherFfaceCarPhoto;// 其它证件反面

	public PolicyZfaceCarPhoto getPolicyZfaceCarPhoto() {
		return policyZfaceCarPhoto;
	}

	private List<AssignDetails> assignDetails;

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public List<AssignDetails> getAssignDetails() {
		return assignDetails;
	}

	public void setAssignDetails(List<AssignDetails> assignDetails) {
		this.assignDetails = assignDetails;
	}

	public class AssignDetails implements Serializable {
		private String assignG;
		private Float weight;
		private Float volume;
		private Float qty;

		@Override
		public String toString() {
			return "AssignDetails [assignG=" + assignG + ", weight=" + weight
					+ ", volume=" + volume + ", qty=" + qty + ", order="
					+ order + "]";
		}

		private Order order;

		public class Order implements Serializable {
			private String pickAddress;
			private String remark;
			private String pickRexman;
			private String pickPhone;

			public String getPickAddress() {
				return pickAddress;
			}

			public void setPickAddress(String pickAddress) {
				this.pickAddress = pickAddress;
			}

			public String getRemark() {
				return remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getPickRexman() {
				return pickRexman;
			}

			public void setPickRexman(String pickRexman) {
				this.pickRexman = pickRexman;
			}

			public String getPickPhone() {
				return pickPhone;
			}

			public void setPickPhone(String pickPhone) {
				this.pickPhone = pickPhone;
			}

			private String customerCode;
			private String assignNo;
			private String companyName;
			private String rexman;
			private String phone;
			private String address;
			private String orderDate;
			private String startCity;
			private String aimsCity;
			private String goodsName;
			private String packageCode;
			private Float helpAmt;
			private String status;
			private String createBy;
			private String createDate;
			private String planCode;
			private String packageName;
			private String aimsCityName;
			private String startCityName;
			private String customerName;
			private String custNo;

			public String getCustNo() {
				return custNo;
			}

			public void setCustNo(String custNo) {
				this.custNo = custNo;
			}

			public String getCustomerCode() {
				return customerCode;
			}

			public void setCustomerCode(String customerCode) {
				this.customerCode = customerCode;
			}

			public String getAssignNo() {
				return assignNo;
			}

			public void setAssignNo(String assignNo) {
				this.assignNo = assignNo;
			}

			public String getCompanyName() {
				return companyName;
			}

			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}

			public String getRexman() {
				return rexman;
			}

			public void setRexman(String rexman) {
				this.rexman = rexman;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getOrderDate() {
				return orderDate;
			}

			public void setOrderDate(String orderDate) {
				this.orderDate = orderDate;
			}

			public String getStartCity() {
				return startCity;
			}

			public void setStartCity(String startCity) {
				this.startCity = startCity;
			}

			public String getAimsCity() {
				return aimsCity;
			}

			public void setAimsCity(String aimsCity) {
				this.aimsCity = aimsCity;
			}

			public String getGoodsName() {
				return goodsName;
			}

			public void setGoodsName(String goodsName) {
				this.goodsName = goodsName;
			}

			public String getPackageCode() {
				return packageCode;
			}

			public void setPackageCode(String packageCode) {
				this.packageCode = packageCode;
			}

			public Float getHelpAmt() {
				return helpAmt;
			}

			public void setHelpAmt(Float helpAmt) {
				this.helpAmt = helpAmt;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreateBy() {
				return createBy;
			}

			public void setCreateBy(String createBy) {
				this.createBy = createBy;
			}

			public String getCreateDate() {
				return createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getPlanCode() {
				return planCode;
			}

			public void setPlanCode(String planCode) {
				this.planCode = planCode;
			}

			public String getPackageName() {
				return packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}

			public String getAimsCityName() {
				return aimsCityName;
			}

			public void setAimsCityName(String aimsCityName) {
				this.aimsCityName = aimsCityName;
			}

			public String getStartCityName() {
				return startCityName;
			}

			public void setStartCityName(String startCityName) {
				this.startCityName = startCityName;
			}

			public String getCustomerName() {
				return customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			@Override
			public String toString() {
				return "Order [pickAddress=" + pickAddress + ", remark="
						+ remark + ", pickRexman=" + pickRexman
						+ ", pickPhone=" + pickPhone + ", customerCode="
						+ customerCode + ", assignNo=" + assignNo
						+ ", companyName=" + companyName + ", rexman=" + rexman
						+ ", phone=" + phone + ", address=" + address
						+ ", orderDate=" + orderDate + ", startCity="
						+ startCity + ", aimsCity=" + aimsCity + ", goodsName="
						+ goodsName + ", packageCode=" + packageCode
						+ ", helpAmt=" + helpAmt + ", status=" + status
						+ ", createBy=" + createBy + ", createDate="
						+ createDate + ", planCode=" + planCode
						+ ", packageName=" + packageName + ", aimsCityName="
						+ aimsCityName + ", startCityName=" + startCityName
						+ ", customerName=" + customerName + ", custNo="
						+ custNo + "]";
			}

		}

		public String getAssignG() {
			return assignG;
		}

		public void setAssignG(String assignG) {
			this.assignG = assignG;
		}

		public Float getWeight() {
			return weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}

		public Float getVolume() {
			return volume;
		}

		public void setVolume(Float volume) {
			this.volume = volume;
		}

		public Float getQty() {
			return qty;
		}

		public void setQty(Float qty) {
			this.qty = qty;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}
	}

	public void setPolicyZfaceCarPhoto(PolicyZfaceCarPhoto policyZfaceCarPhoto) {
		this.policyZfaceCarPhoto = policyZfaceCarPhoto;
	}

	public PolicyFfaceCarPhoto getPolicyFfaceCarPhoto() {
		return policyFfaceCarPhoto;
	}

	public void setPolicyFfaceCarPhoto(PolicyFfaceCarPhoto policyFfaceCarPhoto) {
		this.policyFfaceCarPhoto = policyFfaceCarPhoto;
	}

	public OtherZfaceCarPhoto getOtherZfaceCarPhoto() {
		return otherZfaceCarPhoto;
	}

	public void setOtherZfaceCarPhoto(OtherZfaceCarPhoto otherZfaceCarPhoto) {
		this.otherZfaceCarPhoto = otherZfaceCarPhoto;
	}

	public OtherFfaceCarPhoto getOtherFfaceCarPhoto() {
		return otherFfaceCarPhoto;
	}

	public void setOtherFfaceCarPhoto(OtherFfaceCarPhoto otherFfaceCarPhoto) {
		this.otherFfaceCarPhoto = otherFfaceCarPhoto;
	}

	/**
	 * 其它证件反面
	 * 
	 * @author Administrator
	 *
	 */
	public class OtherFfaceCarPhoto implements Serializable {
		private String createDate;
		private String createBy;
		private String type;
		private String filePath;
		private String fileName;
		private String assignCode;
		private String photoCode;

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCreateBy() {
			return createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getAssignCode() {
			return assignCode;
		}

		public void setAssignCode(String assignCode) {
			this.assignCode = assignCode;
		}

		public String getPhotoCode() {
			return photoCode;
		}

		public void setPhotoCode(String photoCode) {
			this.photoCode = photoCode;
		}

		@Override
		public String toString() {
			return "OtherFfaceCarPhoto [createDate=" + createDate
					+ ", createBy=" + createBy + ", type=" + type
					+ ", filePath=" + filePath + ", fileName=" + fileName
					+ ", assignCode=" + assignCode + ", photoCode=" + photoCode
					+ "]";
		}

	}

	public String getLoaderName() {
		return loaderName;
	}

	public void setLoaderName(String loaderName) {
		this.loaderName = loaderName;
	}

	public float getArriveAmt() {
		return arriveAmt;
	}

	public void setArriveAmt(float arriveAmt) {
		this.arriveAmt = arriveAmt;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPlanEnterDate() {
		return planEnterDate;
	}

	public void setPlanEnterDate(String planEnterDate) {
		this.planEnterDate = planEnterDate;
	}

	public String getCarCode() {
		return carCode;
	}

	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

	public float getOilAmt() {
		return oilAmt;
	}

	public void setOilAmt(float oilAmt) {
		this.oilAmt = oilAmt;
	}

	public float getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}

	public float getPrsettleAmt() {
		return prsettleAmt;
	}

	public void setPrsettleAmt(float prsettleAmt) {
		this.prsettleAmt = prsettleAmt;
	}

	public float getOvsettleAmt() {
		return ovsettleAmt;
	}

	public void setOvsettleAmt(float ovsettleAmt) {
		this.ovsettleAmt = ovsettleAmt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getAssignCode() {
		return assignCode;
	}

	public void setAssignCode(String assignCode) {
		this.assignCode = assignCode;
	}

	public String getStartCityName() {
		return startCityName;
	}

	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

	public String getAimsCityName() {
		return aimsCityName;
	}

	public void setAimsCityName(String aimsCityName) {
		this.aimsCityName = aimsCityName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getPickRexman() {
		return pickRexman;
	}

	public void setPickRexman(String pickRexman) {
		this.pickRexman = pickRexman;
	}

	public String getPickPhone() {
		return pickPhone;
	}

	public void setPickPhone(String pickPhone) {
		this.pickPhone = pickPhone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRexman() {
		return rexman;
	}

	public void setRexman(String rexman) {
		this.rexman = rexman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getPickAddress() {
		return pickAddress;
	}

	public void setPickAddress(String pickAddress) {
		this.pickAddress = pickAddress;
	}

	public String getAimsCity() {
		return aimsCity;
	}

	public void setAimsCity(String aimsCity) {
		this.aimsCity = aimsCity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAssignNo() {
		return assignNo;
	}

	public void setAssignNo(String assignNo) {
		this.assignNo = assignNo;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public Float getHelpAmt() {
		return helpAmt;
	}

	public void setHelpAmt(Float helpAmt) {
		this.helpAmt = helpAmt;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
}