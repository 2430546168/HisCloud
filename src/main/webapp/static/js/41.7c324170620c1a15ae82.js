webpackJsonp([41],{jP4F:function(t,s,e){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var o={components:{loading:e("T4ej").a},data:function(){return{content:"",modal11:!1,doctorList:[],isshowloading:!1}},methods:{tobackdetail:function(){this.$router.push("/admin")},jiankai:function(t){var s=this,e=s.doctorList[t].deptCode,o=s.$store.getters.getUrl+"admin/dept/getDeptContentByDeptCode.do";s.isshowloading=!0,$.ajax({url:o,type:"post",dataType:"json",timeout:15e3,data:{deptCode:e},success:function(t){s.isshowloading=!1,"200"==t.code?(s.modal11=!0,s.content=t.data):"500"==t.code&&(s.modal11=!0,s.content="无")},error:function(t){s.isshowloading=!1}})},_dealdata:function(t){for(var s=[],e=[],o=[],i=[],a=0;a<t.length;a++)"100101"==t[a].deptCode.substring(0,6)?s.push(t[a]):"100102"==t[a].deptCode.substring(0,6)?e.push(t[a]):"100103"==t[a].deptCode.substring(0,6)?o.push(t[a]):i.push(t[a]);this.doctorList=[],this.doctorList.push({deptName:"妇科门诊",gynaecology:s,deptCode:"100101"}),this.doctorList.push({deptName:"产科门诊",obstetrics:e,deptCode:"100102"}),this.doctorList.push({deptName:"儿科门诊",pediatrics:o,deptCode:"100103"});for(var n=0;n<i.length;n++)"皮肤科"==i[n].deptName&&this.doctorList.push({deptName:"皮肤科",deptCode:i[n].deptCode});for(var d=0;d<i.length;d++){var c,r;if(c=i[d].deptName,r=i[d].deptCode,"皮肤科"!=c){var l={deptName:c,deptCode:r};this.doctorList.push(l)}}},DeptInfoList:function(){var t=this,s=t.$store.getters.getUrl+"admin/dept/getDeptInfoList.do";t.isshowloading=!0,$.ajax({url:s,type:"post",dataType:"json",timeout:15e3,data:"",success:function(s){t.isshowloading=!1,"200"==s.code&&t._dealdata(s.data)},error:function(s){t.isshowloading=!1}})}},created:function(){this.DeptInfoList()}},i={render:function(){var t=this,s=t.$createElement,e=t._self._c||s;return e("div",{staticStyle:{height:"100%",overflow:"auto"}},[e("div",{staticClass:"titlei"},[e("div",{staticClass:"title",staticStyle:{position:"relative"}},[e("div",{staticClass:"arrow-icon",on:{click:t.tobackdetail}},[e("Icon",{attrs:{size:"30",type:"ios-arrow-back"}})],1),t._v("\n        科室管理\n        ")])]),t._v(" "),e("div",{staticClass:"content"},[t._l(t.doctorList,function(s,o){return e("div",{key:o,staticClass:"contenter"},[e("div",{staticClass:"doctor"},[e("svg",{staticClass:"avatar",attrs:{t:"1574490551202",viewBox:"0 0 1024 1024",version:"1.1",xmlns:"http://www.w3.org/2000/svg","p-id":"4359",width:"40",height:"40"}},[e("path",{staticClass:"icon",attrs:{d:"M844.8 665.6c-15.36 0-25.6 10.24-25.6 25.6v204.8h-614.4v-204.8c0-15.36-10.24-25.6-25.6-25.6s-25.6 10.24-25.6 25.6v204.8c0 28.16 23.04 51.2 51.2 51.2h614.4c28.16 0 51.2-23.04 51.2-51.2v-204.8c0-15.36-10.24-25.6-25.6-25.6zM742.4 358.4h-460.8c-12.8 0-25.6 12.8-25.6 25.6s12.8 25.6 25.6 25.6h460.8c12.8 0 25.6-12.8 25.6-25.6s-12.8-25.6-25.6-25.6z","p-id":"4360",fill:"#00BBBB"}}),e("path",{attrs:{d:"M512 665.6c-12.8 0-25.6 12.8-25.6 25.6v51.2h-51.2c-12.8 0-25.6 12.8-25.6 25.6s12.8 25.6 25.6 25.6h51.2v51.2c0 12.8 12.8 25.6 25.6 25.6s25.6-12.8 25.6-25.6v-51.2h51.2c12.8 0 25.6-12.8 25.6-25.6s-12.8-25.6-25.6-25.6h-51.2v-51.2c0-12.8-12.8-25.6-25.6-25.6zM944.64 460.8l-94.72-366.08c-2.56-10.24-12.8-17.92-25.6-17.92h-627.2c-12.8 0-23.04 7.68-25.6 17.92L76.8 460.8c-2.56 7.68-2.56 17.92-2.56 25.6 0 84.48 69.12 153.6 153.6 153.6 64 0 117.76-38.4 140.8-92.16 23.04 53.76 76.8 92.16 140.8 92.16s117.76-38.4 140.8-92.16c23.04 53.76 76.8 92.16 140.8 92.16 84.48 0 153.6-69.12 153.6-153.6 2.56-7.68 2.56-17.92 0-25.6z m-151.04 128c-40.96 0-76.8-23.04-94.72-61.44-7.68-17.92-25.6-30.72-46.08-30.72s-38.4 12.8-46.08 30.72c-15.36 38.4-53.76 61.44-94.72 61.44s-76.8-23.04-94.72-61.44c-7.68-17.92-25.6-30.72-46.08-30.72s-38.4 12.8-46.08 30.72c-15.36 38.4-53.76 61.44-94.72 61.44-56.32 0-102.4-46.08-102.4-102.4v-15.36l89.6-343.04h586.24l89.6 343.04v15.36c2.56 56.32-43.52 102.4-99.84 102.4z","p-id":"4361",fill:"#00BBBB"}})]),t._v(" "),e("div",{staticClass:"xinxi"},[e("p",[e("span",[t._v("科室名称：")]),e("span",[t._v(t._s(s.deptName))])]),t._v(" "),e("p",[e("span",[t._v("科室编码：")]),e("span",[t._v(t._s(s.deptCode))])])])]),t._v(" "),e("div",{staticClass:"operate"},[e("Button",{attrs:{type:"primary",size:"small"},on:{click:function(s){return t.jiankai(o)}}},[t._v("查看")])],1)])}),t._v(" "),e("Modal",{attrs:{fullscreen:"",title:"科室介绍"},model:{value:t.modal11,callback:function(s){t.modal11=s},expression:"modal11"}},t._l(t.content.trim().split(/\s+/),function(s,o){return e("p",{key:o,staticStyle:{"text-indent":"24pt","font-size":"16px"}},[t._v("\n                "+t._s(s)+"\n            ")])}),0)],2),t._v(" "),e("loading",{directives:[{name:"show",rawName:"v-show",value:t.isshowloading,expression:"isshowloading"}],staticClass:"loading"})],1)},staticRenderFns:[]};var a=e("VU/8")(o,i,!1,function(t){e("qT7A")},"data-v-66bc2bea",null);s.default=a.exports},qT7A:function(t,s){}});