webpackJsonp([25],{AKX0:function(t,e,l){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i={render:function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{staticStyle:{height:"100%",overflow:"auto"}},[l("div",{staticClass:"titlei"},[l("div",{staticClass:"title",staticStyle:{position:"relative"}},[l("div",{staticClass:"arrow-icon",on:{click:t.tobackdetail}},[l("Icon",{attrs:{size:"30",type:"ios-arrow-back"}})],1),t._v("\n        "+t._s(t.biao)+"\n      ")])]),t._v(" "),l("div",{staticClass:"content"},[l("div",{staticClass:"input"},[l("Form",{ref:"formInline",attrs:{model:t.formInline,"label-width":80}},[l("FormItem",{attrs:{label:"姓名："}},[l("Input",{staticStyle:{width:"200px"},attrs:{placeholder:""},model:{value:t.formInline.user,callback:function(e){t.$set(t.formInline,"user",e)},expression:"formInline.user"}})],1),t._v(" "),l("FormItem",{attrs:{label:"电话："}},[l("Input",{staticStyle:{width:"200px"},attrs:{placeholder:""},model:{value:t.formInline.tel,callback:function(e){t.$set(t.formInline,"tel",e)},expression:"formInline.tel"}})],1),t._v(" "),l("FormItem",{attrs:{label:"编码："}},[l("Input",{staticStyle:{width:"200px"},attrs:{placeholder:""},model:{value:t.formInline.code,callback:function(e){t.$set(t.formInline,"code",e)},expression:"formInline.code"}})],1),t._v(" "),l("FormItem",{attrs:{label:"身份证："}},[l("Input",{staticStyle:{width:"200px"},attrs:{placeholder:""},model:{value:t.formInline.id,callback:function(e){t.$set(t.formInline,"id",e)},expression:"formInline.id"}})],1),t._v(" "),l("FormItem",{attrs:{label:"科室："}},[l("Select",{staticStyle:{width:"200px"},model:{value:t.formInline.dep,callback:function(e){t.$set(t.formInline,"dep",e)},expression:"formInline.dep"}},t._l(t.cityList5,function(e){return l("Option",{key:e.value,attrs:{value:e.value}},[t._v(t._s(e.label))])}),1)],1),t._v(" "),l("FormItem",{attrs:{label:"权限："}},[l("Select",{staticStyle:{width:"200px"},attrs:{filterable:"",multiple:"","allow-create":""},on:{"on-create":t.handleCreate2},model:{value:t.formInline.jurisdiction,callback:function(e){t.$set(t.formInline,"jurisdiction",e)},expression:"formInline.jurisdiction"}},t._l(t.cityList4,function(e){return l("Option",{key:e.value,attrs:{value:e.value}},[t._v(t._s(e.label))])}),1)],1),t._v(" "),l("FormItem",[l("Button",{staticStyle:{width:"200px"},attrs:{type:"primary",long:""}},[t._v("提交")])],1)],1)],1)])])},staticRenderFns:[]};var a=l("VU/8")({data:function(){return{biao:"添加医生",formInline:{user:"",tel:"",id:"",msg:"",dep:"",code:"",jurisdiction:[]},cityList4:[{value:"患者管理",label:"患者管理"},{value:"科室管理",label:"科室管理"},{value:"医生管理",label:"医生管理"}],cityList5:[{value:"妇科门诊一",label:"妇科门诊一"},{value:"妇科门诊二",label:"妇科门诊二"},{value:"产科门诊一",label:"产科门诊一"},{value:"产科门诊二",label:"产科门诊二"},{value:"儿科门诊一",label:"儿科门诊一"},{value:"儿科门诊二",label:"儿科门诊二"}]}},methods:{handleCreate2:function(t){this.cityList4.push({value:t,label:t})},handleSubmit:function(t){var e=this;this.$refs[t].validate(function(t){t?e.$Message.success("Success!"):e.$Message.error("Fail!")})},tobackdetail:function(){0==this.$route.query.start?this.$router.push("/Administrator"):1==this.$route.query.start&&this.$router.push("/Administrator")}},mounted:function(){0==this.$route.query.start?this.biao="修改管理员":1==this.$route.query.start&&(this.biao="添加管理员")}},i,!1,function(t){l("iQb6")},"data-v-ea446922",null);e.default=a.exports},iQb6:function(t,e){}});