webpackJsonp([29],{"P+LT":function(t,e){},Uc2N:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o={data:function(){return{hospitaList:[]}},methods:{tobackdetail:function(){},posthospitaList:function(){var t=this,e=t.$store.getters.getUrl+".do",n=$.ajax({url:e,type:"post",dataType:"json",timeout:15e3,data:{},success:function(t){},error:function(t){},complete:function(e,o){"timeout"==o&&(n.abort(),t.$Modal.warning({title:"友情提示",content:"请求超时"}))}})}},mounted:function(){},created:function(){}},i={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticStyle:{height:"100%",overflow:"auto"}},[e("div",{staticClass:"title"},[e("div",{staticClass:"arrow-icon",on:{click:this.tobackdetail}},[e("Icon",{attrs:{size:"30",type:"ios-arrow-back"}})],1),this._v("\n        预约列表\n    ")])])},staticRenderFns:[]};var a=n("VU/8")(o,i,!1,function(t){n("P+LT")},"data-v-b8d9d0aa",null);e.default=a.exports}});