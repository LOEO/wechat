package com.lt.qrcode.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lt.qrcode.QrCodeType;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-08 11:44:55
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class QrCodeParam {
	@JsonProperty("action_name")
	private QrCodeType actionName;
	@JsonProperty("action_info")
	private ActionInfo actionInfo;

	public QrCodeType getActionName() {
		return actionName;
	}

	public void setActionName(QrCodeType actionName) {
		this.actionName = actionName;
	}

	public ActionInfo getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(ActionInfo actionInfo) {
		this.actionInfo = actionInfo;
	}

	public static class ActionInfo {
		private Scene scene;

		public Scene getScene() {
			return scene;
		}

		public void setScene(Scene scene) {
			this.scene = scene;
		}
	}

	public static class Scene {
		@JsonProperty("scene_id")
		private Integer sceneId = null;
		@JsonProperty("scene_str")
		private String sceneStr;

		public Integer getSceneId() {
			return sceneId;
		}

		public void setSceneId(Integer sceneId) {
			if (sceneId > 100000 || sceneId < 1) {
				throw new UnsupportedOperationException("sceneId只支持1--100000");
			}
			this.sceneId = sceneId;
		}

		public String getSceneStr() {
			return sceneStr;
		}

		public void setSceneStr(String sceneStr) {
			if (sceneStr != null && sceneStr.length() > 64) {
				throw new UnsupportedOperationException("sceneStr长度不能大于64");
			}
			this.sceneStr = sceneStr;
		}
	}

}
