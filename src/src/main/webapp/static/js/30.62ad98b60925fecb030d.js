webpackJsonp([30],{aOL1:function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s={components:{loading:i("T4ej").a},data:function(){return{Administrator:"",adminLevel:"",biao:"",doctorList:[],allswites:"",patientReport:"",statemodel:!1,statemodeles:!1,currentitem:{},deptorList:[],isshowloading:!1}},methods:{ischangestate:function(t){this.currentitem=t,this.statemodel=!0},ischangestates:function(t){this.Administrator.adminLevel<=1&&(this.currentitem=t),this.statemodeles=!0},tobackdetail:function(){this.$router.push("/admin")},docList:function(t){var e,i=this,s=i.$store.getters.getUrl+"admin/doctor/getDoctorInfoList.do";e=void 0!=t?t.value:"",i.isshowloading=!0,$.ajax({url:s,type:"post",dataType:"json",timeout:15e3,data:{deptCode:e},success:function(t){i.isshowloading=!1,200==t.code&&(i.doctorList=t.data)},error:function(t){i.isshowloading=!1}})},updatedkequan:function(){var t=this,e=t.$store.getters.getUrl+"admin/doctor/editPatientReportByDeptCode.do";if(t.Administrator.adminLevel<=1)var i=t.currentitem.deptCode;else if(t.Administrator.adminLevel>1&&t.Administrator.adminLevel<4)i=t.Administrator.deptCode;if(0==t.allswites)var s=1;else if(1==t.allswites)s=0;t.isshowloading=!0,$.ajax({url:e,type:"post",dataType:"json",timeout:15e3,data:{patientReport:s,deptCode:i},success:function(e){t.isshowloading=!1,200==e.code&&(t.Administrator.adminLevel>1&&t.Administrator.adminLevel<4?(t.selectquan(t.Administrator.deptCode),t.docList({value:t.Administrator.deptCode})):t.Administrator.adminLevel<=1&&t.DeptInfoList())},error:function(e){t.isshowloading=!1}})},selectquan:function(t){var e=this,i=e.$store.getters.getUrl+"admin/doctor/getPatientReportByDeptCode.do",s=t;e.isshowloading=!0,$.ajax({url:i,type:"post",dataType:"json",timeout:15e3,data:{deptCode:s},success:function(t){e.isshowloading=!1,200==t.code&&(e.allswites=t.data)},error:function(t){e.isshowloading=!1}})},updatedquan:function(){var t=this,e=t.$store.getters.getUrl+"admin/doctor/editPatientReportByUserName.do",i=t.currentitem.userName;if(0==t.currentitem.patientReport)var s=1;else if(1==t.currentitem.patientReport)s=0;t.isshowloading=!0,$.ajax({url:e,type:"post",dataType:"json",timeout:15e3,data:{patientReport:s,userName:i},success:function(e){t.isshowloading=!1,200==e.code&&(t.Administrator.adminLevel>1&&t.Administrator.adminLevel<4?(t.selectquan(t.Administrator.deptCode),t.docList({value:t.Administrator.deptCode})):t.Administrator.adminLevel>3&&(1==t.patientReport?t.patientReport=0:0==t.patientReport&&(t.patientReport=1)))},error:function(e){t.isshowloading=!1}})},_dealdata:function(t){for(var e=[],i=[],s=[],a=[],o=0;o<t.length;o++)"100101"==t[o].deptCode.substring(0,6)?e.push(t[o]):"100102"==t[o].deptCode.substring(0,6)?i.push(t[o]):"100103"==t[o].deptCode.substring(0,6)?s.push(t[o]):a.push(t[o]);var n=[];for(o=0;o<e.length;o++)0==e[o].patientReport&&n.push(e[o]);for(o=0;o<i.length;o++)0==i[o].patientReport&&n.push(i[o]);for(o=0;o<s.length;o++)0==s[o].patientReport&&n.push(s[o]);this.deptorList=[],n.length>0?this.deptorList.push({deptName:"妇科门诊",gynaecology:e,deptCode:"100101",patientReport:0}):this.deptorList.push({deptName:"妇科门诊",gynaecology:e,deptCode:"100101",patientReport:1}),[].length>0?this.deptorList.push({deptName:"产科门诊",obstetrics:i,deptCode:"100102",patientReport:0}):this.deptorList.push({deptName:"产科门诊",obstetrics:i,deptCode:"100102",patientReport:1}),[].length>0?this.deptorList.push({deptName:"儿科门诊",pediatrics:s,deptCode:"100103",patientReport:0}):this.deptorList.push({deptName:"儿科门诊",pediatrics:s,deptCode:"100103",patientReport:1});for(var r=0;r<a.length;r++)"皮肤科"==a[r].deptName&&this.deptorList.push({deptName:"皮肤科",deptCode:a[r].deptCode,patientReport:a[r].patientReport});for(var d=0;d<a.length;d++){var c,l,p;if(c=a[d].deptName,l=a[d].deptCode,p=a[d].patientReport,"皮肤科"!=c){var u={deptName:c,deptCode:l,patientReport:p};this.deptorList.push(u)}}},DeptInfoList:function(){var t=this,e=t.$store.getters.getUrl+"admin/dept/getDeptInfoList.do";t.isshowloading=!0,$.ajax({url:e,type:"post",dataType:"json",timeout:15e3,data:"",success:function(e){t.isshowloading=!1,"200"==e.code&&t._dealdata(e.data)},error:function(e){t.isshowloading=!1}})}},mounted:function(){void 0!=localStorage.getItem("Administrator")&&""!=localStorage.getItem("Administrator")&&(this.Administrator=JSON.parse(localStorage.getItem("Administrator")),this.adminLevel=this.Administrator.adminLevel,this.Administrator.adminLevel>1&&this.Administrator.adminLevel<4&&(this.biao=this.Administrator.deptName,this.docList({value:this.Administrator.deptCode}),this.selectquan(this.Administrator.deptCode)),this.Administrator.adminLevel>3&&(this.patientReport=this.Administrator.patientReport),this.Administrator.adminLevel<=1&&this.DeptInfoList())}},a={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticStyle:{height:"100%",overflow:"auto"}},[i("div",{staticClass:"titlei"},[i("div",{staticClass:"title",staticStyle:{position:"relative"}},[i("div",{staticClass:"arrow-icon",on:{click:t.tobackdetail}},[i("Icon",{attrs:{size:"30",type:"ios-arrow-back"}})],1),t._v("\n        患者权限管理\n      ")])]),t._v(" "),t.adminLevel<2?i("div",{staticClass:"text"},[t.deptorList.length>0?i("div",{staticClass:"list-content"},t._l(t.deptorList,function(e,s){return i("div",{key:s,staticClass:"item-box"},[i("div",{staticClass:"text-content"},[t._v(t._s(e.deptName)+"病历查看")]),t._v(" "),i("div",{staticClass:"switchopen",class:{activeswitchopen:"0"==e.patientReport},attrs:{size:"large"},on:{click:function(i){return t.ischangestate(e)}}},[t._v("\n                    "+t._s("1"==e.patientReport?"ON":"OFF")+"\n                    "),i("div",{staticClass:"circle",class:{activecircle:"0"==e.patientReport}})])])}),0):t._e()]):t._e(),t._v(" "),t.adminLevel>1&&t.adminLevel<4?i("div",{staticClass:"text"},[i("div",{staticClass:"list-content"},[i("div",{staticClass:"item-box",staticStyle:{background:"#00bbbb",color:"#fff",border:"0"}},[i("div",{staticClass:"text-content"},[t._v(t._s(t.biao)+"病历查看")]),t._v(" "),i("div",{staticClass:"switchopen",class:{activeswitchopen:"0"==t.allswites},attrs:{size:"large"},on:{click:function(e){return t.ischangestates()}}},[t._v("\n                    "+t._s("1"==t.allswites?"ON":"OFF")+"\n                    "),i("div",{staticClass:"circle",class:{activecircle:"0"==t.allswites}})])])]),t._v(" "),t.doctorList.length>0?i("div",{staticClass:"list-content"},t._l(t.doctorList,function(e,s){return i("div",{key:s,staticClass:"item-box"},[i("div",{staticClass:"text-content"},[t._v(t._s(e.name)+"病历查看")]),t._v(" "),i("div",{staticClass:"switchopen",class:{activeswitchopen:"0"==e.patientReport},attrs:{size:"large"},on:{click:function(i){return t.ischangestate(e)}}},[t._v("\n                    "+t._s("1"==e.patientReport?"ON":"OFF")+"\n                    "),i("div",{staticClass:"circle",class:{activecircle:"0"==e.patientReport}})])])}),0):t._e()]):t._e(),t._v(" "),t.adminLevel>3?i("div",{staticClass:"text"},[i("div",{staticClass:"list-content"},[i("div",{staticClass:"item-box",staticStyle:{background:"#00bbbb",color:"#fff",border:"0"}},[i("div",{staticClass:"text-content"},[t._v("患者病历查看")]),t._v(" "),i("div",{staticClass:"switchopen",class:{activeswitchopen:"0"==t.patientReport},attrs:{size:"large"},on:{click:function(e){return t.ischangestate(t.Administrator)}}},[t._v("\n                    "+t._s("1"==t.patientReport?"ON":"OFF")+"\n                    "),i("div",{staticClass:"circle",class:{activecircle:"0"==t.patientReport}})])])])]):t._e(),t._v(" "),i("Modal",{attrs:{title:"提示信息"},on:{"on-ok":t.updatedquan},model:{value:t.statemodel,callback:function(e){t.statemodel=e},expression:"statemodel"}},[i("p",[t._v("请确认是否修改！")])]),t._v(" "),i("Modal",{attrs:{title:"提示信息"},on:{"on-ok":t.updatedkequan},model:{value:t.statemodeles,callback:function(e){t.statemodeles=e},expression:"statemodeles"}},[i("p",[t._v("请确认是否修改！")])])],1)},staticRenderFns:[]};var o=i("VU/8")(s,a,!1,function(t){i("kI25")},"data-v-b1da2044",null);e.default=o.exports},kI25:function(t,e){}});