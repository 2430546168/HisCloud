webpackJsonp([22],{"/IqY":function(t,e){},xQtf:function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=i("mvHQ"),n=i.n(s),a=i("//Fk"),r=i.n(a),o=i("Xxa5"),c=i.n(o),l=i("exGp"),u=i.n(l),d={data:function(){return{inputsize:{minRows:6,maxRows:6},ysinputlist:"",cardno:"",doctoruser:""}},methods:{topath:function(){this.$router.push("/registeredlist")},savediagdesc:function(){var t=this;return u()(c.a.mark(function e(){var i;return c.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,t.fetchdiagdesc();case 2:i=e.sent,t.ysinputlist=i,void 0!=i&&null!=i&&""!=i&&localStorage.setItem("ysnizhen",i);case 5:case"end":return e.stop()}},e,t)}))()},fetchdiagdesc:function(){var t=this,e=new Date,i=e.getFullYear(),s=e.getMonth()+1,n=e.getDate();s<10&&(s="0"+s),n<10&&(n="0"+n);var a=i+"-"+s+"-"+n;return new r.a(function(e,i){var s=t.$store.getters.getUrl+"check/getOutpMrDiagDesc.do",n=$.ajax({url:s,type:"post",dataType:"json",timeout:15e3,async:!0,data:{cardno:t.cardno,visitdate:a,doctorno:t.doctoruser},success:function(t){e(t.data[0].diagdesc)},error:function(t){i(t)},complete:function(e,i){"timeout"==i&&(n.abort(),t.$Modal.warning({title:"友情提示",content:"请求超时"}))}})})},madeWesternMedicine:function(){for(var t=0;t<this.ysinputlist.length;t++)if(""==this.ysinputlist[t])return void this.$Modal.info({title:"提示信息",content:"输入框内容禁止为空,请填写相应信息或者删除没有信息的输入框！"});localStorage.setItem("ysnizhen",n()(this.ysinputlist)),localStorage.setItem("ysorderclass","A"),this.$router.push("/prescription")},madeChineseMedicine:function(){for(var t=0;t<this.ysinputlist.length;t++)if(""==this.ysinputlist[t])return void this.$Modal.info({title:"提示信息",content:"输入框内容禁止为空,请填写相应信息或者删除没有信息的输入框！"});localStorage.setItem("ysnizhen",n()(this.ysinputlist)),localStorage.setItem("ysorderclass","B"),this.$router.push("/zhprescription")}},mounted:function(){var t=localStorage.getItem("yspatientinfo"),e=JSON.parse(t);this.doctoruser=e.doctor,this.cardno=e.patientid,this.savediagdesc()}},p={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"examination-page"},[i("div",{staticClass:"title"},[i("div",{staticClass:"title-arrow-icon",on:{click:t.topath}},[i("Icon",{attrs:{size:"20",color:"rgb(255,255,255)",type:"ios-arrow-back"}})],1),t._v(" "),i("p",[t._v("拟诊")])]),t._v(" "),i("div",{staticClass:"content"},[i("div",{staticClass:"input-item"},[i("div",{staticClass:"text"},[t._v("拟诊:")]),t._v(" "),i("Input",{attrs:{type:"textarea",autosize:t.inputsize,disabled:""},model:{value:t.ysinputlist,callback:function(e){t.ysinputlist=e},expression:"ysinputlist"}})],1)]),t._v(" "),i("div",{staticClass:"btn-wrapper"},[i("Button",{staticClass:"btn",attrs:{type:"primary",long:""},on:{click:t.madeWesternMedicine}},[t._v("开西药")]),t._v(" "),i("Button",{staticClass:"btn",attrs:{type:"primary",long:""},on:{click:t.madeChineseMedicine}},[t._v("开中药")])],1)])},staticRenderFns:[]};var v=i("VU/8")(d,p,!1,function(t){i("/IqY")},"data-v-f5ea6f5e",null);e.default=v.exports}});