webpackJsonp([78],{"+9C7":function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=s("//Fk"),i=s.n(a),n=s("+n8h"),o=s("HywI"),l=s("T4ej"),r=s("uGJ5"),c=new Date;c.getFullYear();if(c.getMonth()+1<10)c.getMonth();else c.getMonth();if(c.getDate()<10)c.getDate();else c.getDate();var v={components:{tabbar:n.a,pullRefresh:o.a,loading:l.a},data:function(){return{prescription:[],drugList:[],value3:"0",cardno:[],model1:"",cityList:[],cardlist:[],modal11:!1,value1:"",isshowloading:!1,model2:"",TestdeList:[],size:10}},methods:{datatime:function(t){var e=t,s=this.p(e.getFullYear()),a=this.p(e.getMonth()+1);this.p(e.getDate());return s+"-"+a},formatDates:function(t){var e=t.getFullYear();if(t.getMonth()+1<10)var s="0"+(t.getMonth()+1);else s=t.getMonth()+1;if(t.getDate()<10)var a="0"+t.getDate();else a=t.getDate();return e+"-"+s+"-"+a},p:function(t){return t<10?"0"+t:t},refresh:function(){var t=this;return new i.a(function(e,s){setTimeout(function(){t.examineList(),e()},2e3)})},selectcard:function(t){this.examineList(t)},tobackdetail:function(){this.$router.push("/Myaccount")},qingkong:function(){""!=this.value1&&null!=this.value1&&(this.value1="",this.examineList())},shaixuan:function(){null==this.value1?(this.value1="",this.size=10):this.value1=this.datatime(this.value1),this.examineList()},examineList:function(){var t=this,e=t.$store.getters.getUrl+"chemicalexam/getAssayResultTakeNotes.do",s=localStorage.getItem("cardno"),a=t.value1,i=t.size;t.isshowloading=!0;var n=$.ajax({url:e,type:"post",dataType:"json",timeout:15e3,data:{cardno:s,requestime:a,size:i},success:function(e){t.isshowloading=!1;t.isshowloading=!1,1==e.status?t.prescription=e.data:0==e.status&&(t.prescription=[])},error:function(e){t.isshowloading=!1,t.$Message.error("请求失败")},complete:function(e,s){"timeout"==s&&(n.abort(),t.$Modal.warning({title:"友情提示",content:"请求超时"}))}})},Testdetails:function(t){var e=this;e.modal11=!0;var s=e.$store.getters.getUrl+"chemicalexam/getAssayResult.do",a=this.prescription[t].test_no;e.isshowloading=!0;var i=$.ajax({type:"post",url:s,dataType:"json",timeout:15e3,data:{testno:a},success:function(t){e.isshowloading=!1,1==t.status&&(e.TestdeList=t.data)},error:function(t){e.isshowloading=!1,e.$Message.error("请求失败")},complete:function(t,s){"timeout"==s&&(i.abort(),e.$Modal.warning({title:"友情提示",content:"请求超时"}))}})}},mounted:function(){var t=this;t.isshowloading=!0;var e=document.querySelector(".MyExamine"),s=e.offsetHeight;setInterval(function(){e.onscroll=function(){var a=e.scrollTop,i=e.scrollHeight;s+a-i>=-1&&(t.size+=5,t.examineList())}},1e3),t.examineList();var a=t.$store.getters.getUrl+"SweepCode.do";Object(r.a)(a)}},u={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"MyExamine"},[s("div",{staticClass:"titlei"},[s("div",{staticClass:"title"},[s("div",{staticClass:"arrow-icon",on:{click:t.tobackdetail}},[s("Icon",{attrs:{size:"30",type:"ios-arrow-back"}})],1),t._v("\n        我的化验结果\n        ")]),t._v(" "),s("div",{staticClass:"xuanze",staticStyle:{position:"relative"}},[s("div",{staticStyle:{display:"inline-block",width:"100%"}},[s("span",{staticStyle:{color:"rgb(40, 184, 161)","font-size":"20px"},on:{click:t.qingkong}},[t._v("全部化验结果")]),t._v(" "),s("el-date-picker",{staticStyle:{width:"30%",border:"0",position:"absolute",right:"5%",top:"7px"},attrs:{type:"month",placeholder:"选择月份",editable:!1,clearable:!0,size:"small"},on:{change:t.shaixuan},model:{value:t.value1,callback:function(e){t.value1=e},expression:"value1"}})],1)])]),t._v(" "),s("div",{staticClass:"contenttt"},[t.prescription.length<=0?s("div",{staticClass:"fee-item",staticStyle:{"font-size":"20px","text-align":"center"}},[s("p",{staticStyle:{padding:"20%","font-size":"18px"}},[t._v("暂无数据")])]):t._e(),t._v(" "),void 0!==t.prescription&&t.prescription.length>0?s("div",{staticClass:"fee-item"},t._l(t.prescription,function(e,a){return s("div",{key:a},[s("div",{staticClass:"content"},[s("p",[s("span",[t._v("检查号")]),t._v(" "),s("span",[t._v(t._s(e.test_no))])]),t._v(" "),s("p",[s("span",[t._v("患者卡号")]),t._v(" "),s("span",[t._v(t._s(e.patient_id))])]),t._v(" "),s("p",[s("span",[t._v("就诊日期")]),t._v(" "),s("span",[t._v(t._s(t.formatDates(new Date(e.requested_date_time))))])]),t._v(" "),s("p",[s("span",[t._v("项目名称")]),t._v(" "),s("span",[t._v(t._s(e.item_name))])]),t._v(" "),s("p",[s("span",[t._v("项目明细")]),t._v(" "),s("span",{staticStyle:{color:"blue"},on:{click:function(e){return t.Testdetails(a)}}},[t._v("查看>")])]),t._v(" "),s("Modal",{attrs:{fullscreen:"",title:"化验明细"},model:{value:t.modal11,callback:function(e){t.modal11=e},expression:"modal11"}},[t.TestdeList.length<=0?s("div",[s("p",{staticStyle:{"text-align":"center","font-size":"18px"}},[t._v("暂无明细")])]):t._e(),t._v(" "),t._l(t.TestdeList,function(e,a){return s("div",{key:a,staticClass:"content"},[s("p",[s("span",[t._v("项目名称")]),t._v(" "),s("span",[t._v(t._s(e.report_item_name))])]),t._v(" "),s("p",[s("span",[t._v("项目序号")]),t._v(" "),s("span",[t._v(t._s(e.item_no))])]),t._v(" "),s("p",[s("span",[t._v("报告日期")]),t._v(" "),s("span",[t._v(t._s(t.formatDates(new Date(e.result_date_time))))])]),t._v(" "),s("p",[s("span",[t._v("化验结果")]),t._v(" "),s("span",[t._v(t._s(e.result))])]),t._v(" "),s("p",[s("span",[t._v("单位")]),t._v(" "),s("span",[t._v(t._s(e.units))])]),t._v(" "),s("p",[s("span",[t._v("参考值")]),t._v(" "),s("span",[t._v(t._s(e.print_context))])]),t._v(" "),s("p",[s("span",[t._v("异常")]),t._v(" "),s("span",[t._v(t._s(e.abnormal_indicator))])])])})],2)],1)])}),0):t._e()]),t._v(" "),s("tabbar",{staticClass:"tabbar"}),t._v(" "),s("loading",{directives:[{name:"show",rawName:"v-show",value:t.isshowloading,expression:"isshowloading"}],staticClass:"loading"})],1)},staticRenderFns:[]};var p=s("VU/8")(v,u,!1,function(t){s("1WDd")},"data-v-12bd02e2",null);e.default=p.exports},"1WDd":function(t,e){}});