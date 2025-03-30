sap.ui.define(["sap/ui/core/mvc/Controller"], function (Controller) {
  "use strict";
  return Controller.extend("myApp.controller.App", {
    onInit: function () {
      var oModel = new sap.ui.model.odata.v2.ODataModel("/odata.svc/");
      this.getView().setModel(oModel);
    }
  });
});

