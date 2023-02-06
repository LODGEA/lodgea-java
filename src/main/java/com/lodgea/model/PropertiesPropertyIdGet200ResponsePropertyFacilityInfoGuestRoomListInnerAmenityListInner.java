/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lodgea.JSON;

/**
 * PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-06T17:11:31.294726198Z[Etc/UTC]")
public class PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner {
  /**
   * The code indicating the room amenity type.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#unitand-room-amenity-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_5(new BigDecimal("5")),
    
    NUMBER_6(new BigDecimal("6")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_8(new BigDecimal("8")),
    
    NUMBER_9(new BigDecimal("9")),
    
    NUMBER_10(new BigDecimal("10")),
    
    NUMBER_11(new BigDecimal("11")),
    
    NUMBER_12(new BigDecimal("12")),
    
    NUMBER_13(new BigDecimal("13")),
    
    NUMBER_14(new BigDecimal("14")),
    
    NUMBER_15(new BigDecimal("15")),
    
    NUMBER_16(new BigDecimal("16")),
    
    NUMBER_17(new BigDecimal("17")),
    
    NUMBER_18(new BigDecimal("18")),
    
    NUMBER_19(new BigDecimal("19")),
    
    NUMBER_20(new BigDecimal("20")),
    
    NUMBER_21(new BigDecimal("21")),
    
    NUMBER_22(new BigDecimal("22")),
    
    NUMBER_23(new BigDecimal("23")),
    
    NUMBER_24(new BigDecimal("24")),
    
    NUMBER_25(new BigDecimal("25")),
    
    NUMBER_26(new BigDecimal("26")),
    
    NUMBER_27(new BigDecimal("27")),
    
    NUMBER_28(new BigDecimal("28")),
    
    NUMBER_29(new BigDecimal("29")),
    
    NUMBER_30(new BigDecimal("30")),
    
    NUMBER_31(new BigDecimal("31")),
    
    NUMBER_32(new BigDecimal("32")),
    
    NUMBER_33(new BigDecimal("33")),
    
    NUMBER_34(new BigDecimal("34")),
    
    NUMBER_35(new BigDecimal("35")),
    
    NUMBER_36(new BigDecimal("36")),
    
    NUMBER_37(new BigDecimal("37")),
    
    NUMBER_38(new BigDecimal("38")),
    
    NUMBER_39(new BigDecimal("39")),
    
    NUMBER_40(new BigDecimal("40")),
    
    NUMBER_41(new BigDecimal("41")),
    
    NUMBER_42(new BigDecimal("42")),
    
    NUMBER_43(new BigDecimal("43")),
    
    NUMBER_44(new BigDecimal("44")),
    
    NUMBER_45(new BigDecimal("45")),
    
    NUMBER_46(new BigDecimal("46")),
    
    NUMBER_47(new BigDecimal("47")),
    
    NUMBER_48(new BigDecimal("48")),
    
    NUMBER_49(new BigDecimal("49")),
    
    NUMBER_50(new BigDecimal("50")),
    
    NUMBER_51(new BigDecimal("51")),
    
    NUMBER_52(new BigDecimal("52")),
    
    NUMBER_53(new BigDecimal("53")),
    
    NUMBER_54(new BigDecimal("54")),
    
    NUMBER_55(new BigDecimal("55")),
    
    NUMBER_56(new BigDecimal("56")),
    
    NUMBER_57(new BigDecimal("57")),
    
    NUMBER_58(new BigDecimal("58")),
    
    NUMBER_59(new BigDecimal("59")),
    
    NUMBER_60(new BigDecimal("60")),
    
    NUMBER_61(new BigDecimal("61")),
    
    NUMBER_62(new BigDecimal("62")),
    
    NUMBER_63(new BigDecimal("63")),
    
    NUMBER_64(new BigDecimal("64")),
    
    NUMBER_65(new BigDecimal("65")),
    
    NUMBER_66(new BigDecimal("66")),
    
    NUMBER_67(new BigDecimal("67")),
    
    NUMBER_68(new BigDecimal("68")),
    
    NUMBER_69(new BigDecimal("69")),
    
    NUMBER_70(new BigDecimal("70")),
    
    NUMBER_71(new BigDecimal("71")),
    
    NUMBER_72(new BigDecimal("72")),
    
    NUMBER_73(new BigDecimal("73")),
    
    NUMBER_74(new BigDecimal("74")),
    
    NUMBER_75(new BigDecimal("75")),
    
    NUMBER_76(new BigDecimal("76")),
    
    NUMBER_77(new BigDecimal("77")),
    
    NUMBER_78(new BigDecimal("78")),
    
    NUMBER_79(new BigDecimal("79")),
    
    NUMBER_80(new BigDecimal("80")),
    
    NUMBER_81(new BigDecimal("81")),
    
    NUMBER_82(new BigDecimal("82")),
    
    NUMBER_83(new BigDecimal("83")),
    
    NUMBER_84(new BigDecimal("84")),
    
    NUMBER_85(new BigDecimal("85")),
    
    NUMBER_86(new BigDecimal("86")),
    
    NUMBER_87(new BigDecimal("87")),
    
    NUMBER_88(new BigDecimal("88")),
    
    NUMBER_89(new BigDecimal("89")),
    
    NUMBER_90(new BigDecimal("90")),
    
    NUMBER_91(new BigDecimal("91")),
    
    NUMBER_92(new BigDecimal("92")),
    
    NUMBER_93(new BigDecimal("93")),
    
    NUMBER_94(new BigDecimal("94")),
    
    NUMBER_95(new BigDecimal("95")),
    
    NUMBER_96(new BigDecimal("96")),
    
    NUMBER_97(new BigDecimal("97")),
    
    NUMBER_98(new BigDecimal("98")),
    
    NUMBER_99(new BigDecimal("99")),
    
    NUMBER_100(new BigDecimal("100")),
    
    NUMBER_101(new BigDecimal("101")),
    
    NUMBER_102(new BigDecimal("102")),
    
    NUMBER_103(new BigDecimal("103")),
    
    NUMBER_104(new BigDecimal("104")),
    
    NUMBER_105(new BigDecimal("105")),
    
    NUMBER_106(new BigDecimal("106")),
    
    NUMBER_107(new BigDecimal("107")),
    
    NUMBER_108(new BigDecimal("108")),
    
    NUMBER_109(new BigDecimal("109")),
    
    NUMBER_110(new BigDecimal("110")),
    
    NUMBER_111(new BigDecimal("111")),
    
    NUMBER_112(new BigDecimal("112")),
    
    NUMBER_113(new BigDecimal("113")),
    
    NUMBER_114(new BigDecimal("114")),
    
    NUMBER_115(new BigDecimal("115")),
    
    NUMBER_116(new BigDecimal("116")),
    
    NUMBER_117(new BigDecimal("117")),
    
    NUMBER_118(new BigDecimal("118")),
    
    NUMBER_119(new BigDecimal("119")),
    
    NUMBER_120(new BigDecimal("120")),
    
    NUMBER_121(new BigDecimal("121")),
    
    NUMBER_122(new BigDecimal("122")),
    
    NUMBER_123(new BigDecimal("123")),
    
    NUMBER_124(new BigDecimal("124")),
    
    NUMBER_125(new BigDecimal("125")),
    
    NUMBER_126(new BigDecimal("126")),
    
    NUMBER_127(new BigDecimal("127")),
    
    NUMBER_128(new BigDecimal("128")),
    
    NUMBER_129(new BigDecimal("129")),
    
    NUMBER_130(new BigDecimal("130")),
    
    NUMBER_131(new BigDecimal("131")),
    
    NUMBER_132(new BigDecimal("132")),
    
    NUMBER_133(new BigDecimal("133")),
    
    NUMBER_134(new BigDecimal("134")),
    
    NUMBER_135(new BigDecimal("135")),
    
    NUMBER_136(new BigDecimal("136")),
    
    NUMBER_137(new BigDecimal("137")),
    
    NUMBER_138(new BigDecimal("138")),
    
    NUMBER_139(new BigDecimal("139")),
    
    NUMBER_140(new BigDecimal("140")),
    
    NUMBER_141(new BigDecimal("141")),
    
    NUMBER_142(new BigDecimal("142")),
    
    NUMBER_143(new BigDecimal("143")),
    
    NUMBER_144(new BigDecimal("144")),
    
    NUMBER_145(new BigDecimal("145")),
    
    NUMBER_146(new BigDecimal("146")),
    
    NUMBER_147(new BigDecimal("147")),
    
    NUMBER_148(new BigDecimal("148")),
    
    NUMBER_149(new BigDecimal("149")),
    
    NUMBER_150(new BigDecimal("150")),
    
    NUMBER_151(new BigDecimal("151")),
    
    NUMBER_152(new BigDecimal("152")),
    
    NUMBER_153(new BigDecimal("153")),
    
    NUMBER_154(new BigDecimal("154")),
    
    NUMBER_155(new BigDecimal("155")),
    
    NUMBER_156(new BigDecimal("156")),
    
    NUMBER_157(new BigDecimal("157")),
    
    NUMBER_158(new BigDecimal("158")),
    
    NUMBER_159(new BigDecimal("159")),
    
    NUMBER_160(new BigDecimal("160")),
    
    NUMBER_161(new BigDecimal("161")),
    
    NUMBER_162(new BigDecimal("162")),
    
    NUMBER_163(new BigDecimal("163")),
    
    NUMBER_164(new BigDecimal("164")),
    
    NUMBER_165(new BigDecimal("165")),
    
    NUMBER_166(new BigDecimal("166")),
    
    NUMBER_167(new BigDecimal("167")),
    
    NUMBER_168(new BigDecimal("168")),
    
    NUMBER_169(new BigDecimal("169")),
    
    NUMBER_170(new BigDecimal("170")),
    
    NUMBER_171(new BigDecimal("171")),
    
    NUMBER_172(new BigDecimal("172")),
    
    NUMBER_173(new BigDecimal("173")),
    
    NUMBER_174(new BigDecimal("174")),
    
    NUMBER_175(new BigDecimal("175")),
    
    NUMBER_176(new BigDecimal("176")),
    
    NUMBER_177(new BigDecimal("177")),
    
    NUMBER_178(new BigDecimal("178")),
    
    NUMBER_179(new BigDecimal("179")),
    
    NUMBER_180(new BigDecimal("180")),
    
    NUMBER_181(new BigDecimal("181")),
    
    NUMBER_182(new BigDecimal("182")),
    
    NUMBER_183(new BigDecimal("183")),
    
    NUMBER_184(new BigDecimal("184")),
    
    NUMBER_185(new BigDecimal("185")),
    
    NUMBER_186(new BigDecimal("186")),
    
    NUMBER_187(new BigDecimal("187")),
    
    NUMBER_188(new BigDecimal("188")),
    
    NUMBER_189(new BigDecimal("189")),
    
    NUMBER_190(new BigDecimal("190")),
    
    NUMBER_191(new BigDecimal("191")),
    
    NUMBER_192(new BigDecimal("192")),
    
    NUMBER_193(new BigDecimal("193")),
    
    NUMBER_194(new BigDecimal("194")),
    
    NUMBER_195(new BigDecimal("195")),
    
    NUMBER_196(new BigDecimal("196")),
    
    NUMBER_197(new BigDecimal("197")),
    
    NUMBER_198(new BigDecimal("198")),
    
    NUMBER_199(new BigDecimal("199")),
    
    NUMBER_200(new BigDecimal("200")),
    
    NUMBER_201(new BigDecimal("201")),
    
    NUMBER_202(new BigDecimal("202")),
    
    NUMBER_203(new BigDecimal("203")),
    
    NUMBER_204(new BigDecimal("204")),
    
    NUMBER_205(new BigDecimal("205")),
    
    NUMBER_206(new BigDecimal("206")),
    
    NUMBER_207(new BigDecimal("207")),
    
    NUMBER_208(new BigDecimal("208")),
    
    NUMBER_209(new BigDecimal("209")),
    
    NUMBER_210(new BigDecimal("210")),
    
    NUMBER_211(new BigDecimal("211")),
    
    NUMBER_212(new BigDecimal("212")),
    
    NUMBER_213(new BigDecimal("213")),
    
    NUMBER_214(new BigDecimal("214")),
    
    NUMBER_215(new BigDecimal("215")),
    
    NUMBER_216(new BigDecimal("216")),
    
    NUMBER_217(new BigDecimal("217")),
    
    NUMBER_218(new BigDecimal("218")),
    
    NUMBER_219(new BigDecimal("219")),
    
    NUMBER_220(new BigDecimal("220")),
    
    NUMBER_221(new BigDecimal("221")),
    
    NUMBER_222(new BigDecimal("222")),
    
    NUMBER_223(new BigDecimal("223")),
    
    NUMBER_224(new BigDecimal("224")),
    
    NUMBER_225(new BigDecimal("225")),
    
    NUMBER_226(new BigDecimal("226")),
    
    NUMBER_227(new BigDecimal("227")),
    
    NUMBER_228(new BigDecimal("228")),
    
    NUMBER_229(new BigDecimal("229")),
    
    NUMBER_230(new BigDecimal("230")),
    
    NUMBER_231(new BigDecimal("231")),
    
    NUMBER_232(new BigDecimal("232")),
    
    NUMBER_233(new BigDecimal("233")),
    
    NUMBER_234(new BigDecimal("234")),
    
    NUMBER_235(new BigDecimal("235")),
    
    NUMBER_236(new BigDecimal("236")),
    
    NUMBER_237(new BigDecimal("237")),
    
    NUMBER_238(new BigDecimal("238")),
    
    NUMBER_239(new BigDecimal("239")),
    
    NUMBER_240(new BigDecimal("240")),
    
    NUMBER_241(new BigDecimal("241")),
    
    NUMBER_242(new BigDecimal("242")),
    
    NUMBER_243(new BigDecimal("243")),
    
    NUMBER_244(new BigDecimal("244")),
    
    NUMBER_245(new BigDecimal("245")),
    
    NUMBER_246(new BigDecimal("246")),
    
    NUMBER_247(new BigDecimal("247")),
    
    NUMBER_248(new BigDecimal("248")),
    
    NUMBER_249(new BigDecimal("249")),
    
    NUMBER_250(new BigDecimal("250")),
    
    NUMBER_251(new BigDecimal("251")),
    
    NUMBER_252(new BigDecimal("252")),
    
    NUMBER_253(new BigDecimal("253")),
    
    NUMBER_254(new BigDecimal("254")),
    
    NUMBER_255(new BigDecimal("255")),
    
    NUMBER_256(new BigDecimal("256")),
    
    NUMBER_257(new BigDecimal("257")),
    
    NUMBER_258(new BigDecimal("258")),
    
    NUMBER_259(new BigDecimal("259")),
    
    NUMBER_260(new BigDecimal("260")),
    
    NUMBER_261(new BigDecimal("261")),
    
    NUMBER_262(new BigDecimal("262")),
    
    NUMBER_263(new BigDecimal("263")),
    
    NUMBER_264(new BigDecimal("264")),
    
    NUMBER_265(new BigDecimal("265")),
    
    NUMBER_266(new BigDecimal("266")),
    
    NUMBER_267(new BigDecimal("267")),
    
    NUMBER_268(new BigDecimal("268")),
    
    NUMBER_269(new BigDecimal("269")),
    
    NUMBER_270(new BigDecimal("270")),
    
    NUMBER_271(new BigDecimal("271")),
    
    NUMBER_272(new BigDecimal("272")),
    
    NUMBER_273(new BigDecimal("273")),
    
    NUMBER_274(new BigDecimal("274")),
    
    NUMBER_275(new BigDecimal("275")),
    
    NUMBER_276(new BigDecimal("276")),
    
    NUMBER_277(new BigDecimal("277")),
    
    NUMBER_278(new BigDecimal("278")),
    
    NUMBER_279(new BigDecimal("279")),
    
    NUMBER_280(new BigDecimal("280")),
    
    NUMBER_281(new BigDecimal("281")),
    
    NUMBER_282(new BigDecimal("282")),
    
    NUMBER_283(new BigDecimal("283")),
    
    NUMBER_5001(new BigDecimal("5001")),
    
    NUMBER_5002(new BigDecimal("5002")),
    
    NUMBER_5003(new BigDecimal("5003")),
    
    NUMBER_5004(new BigDecimal("5004")),
    
    NUMBER_5005(new BigDecimal("5005")),
    
    NUMBER_5006(new BigDecimal("5006")),
    
    NUMBER_5007(new BigDecimal("5007")),
    
    NUMBER_5008(new BigDecimal("5008")),
    
    NUMBER_5009(new BigDecimal("5009")),
    
    NUMBER_5010(new BigDecimal("5010")),
    
    NUMBER_5011(new BigDecimal("5011")),
    
    NUMBER_5012(new BigDecimal("5012")),
    
    NUMBER_5013(new BigDecimal("5013")),
    
    NUMBER_5014(new BigDecimal("5014")),
    
    NUMBER_5015(new BigDecimal("5015")),
    
    NUMBER_5016(new BigDecimal("5016")),
    
    NUMBER_5017(new BigDecimal("5017")),
    
    NUMBER_5018(new BigDecimal("5018")),
    
    NUMBER_5019(new BigDecimal("5019")),
    
    NUMBER_5020(new BigDecimal("5020")),
    
    NUMBER_5021(new BigDecimal("5021")),
    
    NUMBER_5022(new BigDecimal("5022")),
    
    NUMBER_5023(new BigDecimal("5023")),
    
    NUMBER_5024(new BigDecimal("5024")),
    
    NUMBER_5025(new BigDecimal("5025")),
    
    NUMBER_5026(new BigDecimal("5026")),
    
    NUMBER_5027(new BigDecimal("5027")),
    
    NUMBER_5028(new BigDecimal("5028")),
    
    NUMBER_5029(new BigDecimal("5029")),
    
    NUMBER_5030(new BigDecimal("5030")),
    
    NUMBER_5031(new BigDecimal("5031")),
    
    NUMBER_5032(new BigDecimal("5032")),
    
    NUMBER_5033(new BigDecimal("5033")),
    
    NUMBER_5034(new BigDecimal("5034")),
    
    NUMBER_5035(new BigDecimal("5035")),
    
    NUMBER_5036(new BigDecimal("5036")),
    
    NUMBER_5037(new BigDecimal("5037")),
    
    NUMBER_5038(new BigDecimal("5038")),
    
    NUMBER_5039(new BigDecimal("5039")),
    
    NUMBER_5040(new BigDecimal("5040")),
    
    NUMBER_5041(new BigDecimal("5041")),
    
    NUMBER_5042(new BigDecimal("5042")),
    
    NUMBER_5043(new BigDecimal("5043")),
    
    NUMBER_5044(new BigDecimal("5044")),
    
    NUMBER_5045(new BigDecimal("5045")),
    
    NUMBER_5046(new BigDecimal("5046")),
    
    NUMBER_5068(new BigDecimal("5068")),
    
    NUMBER_5069(new BigDecimal("5069")),
    
    NUMBER_5070(new BigDecimal("5070")),
    
    NUMBER_5071(new BigDecimal("5071")),
    
    NUMBER_5072(new BigDecimal("5072")),
    
    NUMBER_5073(new BigDecimal("5073")),
    
    NUMBER_5074(new BigDecimal("5074")),
    
    NUMBER_5075(new BigDecimal("5075")),
    
    NUMBER_5076(new BigDecimal("5076")),
    
    NUMBER_5077(new BigDecimal("5077")),
    
    NUMBER_5079(new BigDecimal("5079")),
    
    NUMBER_5080(new BigDecimal("5080")),
    
    NUMBER_5081(new BigDecimal("5081")),
    
    NUMBER_5082(new BigDecimal("5082")),
    
    NUMBER_5083(new BigDecimal("5083")),
    
    NUMBER_5084(new BigDecimal("5084")),
    
    NUMBER_5085(new BigDecimal("5085")),
    
    NUMBER_5086(new BigDecimal("5086")),
    
    NUMBER_5087(new BigDecimal("5087")),
    
    NUMBER_5088(new BigDecimal("5088")),
    
    NUMBER_5089(new BigDecimal("5089")),
    
    NUMBER_5090(new BigDecimal("5090")),
    
    NUMBER_5091(new BigDecimal("5091")),
    
    NUMBER_5092(new BigDecimal("5092")),
    
    NUMBER_5093(new BigDecimal("5093")),
    
    NUMBER_5094(new BigDecimal("5094")),
    
    NUMBER_5095(new BigDecimal("5095")),
    
    NUMBER_5096(new BigDecimal("5096")),
    
    NUMBER_5097(new BigDecimal("5097")),
    
    NUMBER_5098(new BigDecimal("5098")),
    
    NUMBER_5099(new BigDecimal("5099")),
    
    NUMBER_5100(new BigDecimal("5100")),
    
    NUMBER_5101(new BigDecimal("5101")),
    
    NUMBER_5102(new BigDecimal("5102")),
    
    NUMBER_5103(new BigDecimal("5103")),
    
    NUMBER_5104(new BigDecimal("5104")),
    
    NUMBER_5105(new BigDecimal("5105")),
    
    NUMBER_5106(new BigDecimal("5106")),
    
    NUMBER_5107(new BigDecimal("5107")),
    
    NUMBER_5108(new BigDecimal("5108")),
    
    NUMBER_5109(new BigDecimal("5109")),
    
    NUMBER_5110(new BigDecimal("5110")),
    
    NUMBER_5111(new BigDecimal("5111")),
    
    NUMBER_5112(new BigDecimal("5112")),
    
    NUMBER_5113(new BigDecimal("5113")),
    
    NUMBER_5114(new BigDecimal("5114")),
    
    NUMBER_5115(new BigDecimal("5115")),
    
    NUMBER_5116(new BigDecimal("5116")),
    
    NUMBER_5117(new BigDecimal("5117")),
    
    NUMBER_5118(new BigDecimal("5118")),
    
    NUMBER_5119(new BigDecimal("5119")),
    
    NUMBER_5120(new BigDecimal("5120")),
    
    NUMBER_5121(new BigDecimal("5121")),
    
    NUMBER_5122(new BigDecimal("5122")),
    
    NUMBER_5123(new BigDecimal("5123")),
    
    NUMBER_5124(new BigDecimal("5124")),
    
    NUMBER_5125(new BigDecimal("5125")),
    
    NUMBER_5126(new BigDecimal("5126")),
    
    NUMBER_5127(new BigDecimal("5127")),
    
    NUMBER_5129(new BigDecimal("5129")),
    
    NUMBER_5130(new BigDecimal("5130")),
    
    NUMBER_5131(new BigDecimal("5131")),
    
    NUMBER_5132(new BigDecimal("5132")),
    
    NUMBER_5133(new BigDecimal("5133")),
    
    NUMBER_5134(new BigDecimal("5134")),
    
    NUMBER_5135(new BigDecimal("5135")),
    
    NUMBER_5136(new BigDecimal("5136")),
    
    NUMBER_5137(new BigDecimal("5137")),
    
    NUMBER_5138(new BigDecimal("5138")),
    
    NUMBER_5139(new BigDecimal("5139")),
    
    NUMBER_5140(new BigDecimal("5140")),
    
    NUMBER_5141(new BigDecimal("5141")),
    
    NUMBER_5142(new BigDecimal("5142")),
    
    NUMBER_5143(new BigDecimal("5143")),
    
    NUMBER_5144(new BigDecimal("5144")),
    
    NUMBER_5145(new BigDecimal("5145")),
    
    NUMBER_5146(new BigDecimal("5146")),
    
    NUMBER_5147(new BigDecimal("5147")),
    
    NUMBER_5148(new BigDecimal("5148")),
    
    NUMBER_5149(new BigDecimal("5149")),
    
    NUMBER_5150(new BigDecimal("5150")),
    
    NUMBER_5151(new BigDecimal("5151")),
    
    NUMBER_5152(new BigDecimal("5152")),
    
    NUMBER_5153(new BigDecimal("5153")),
    
    NUMBER_5154(new BigDecimal("5154")),
    
    NUMBER_5157(new BigDecimal("5157")),
    
    NUMBER_5158(new BigDecimal("5158")),
    
    NUMBER_5159(new BigDecimal("5159")),
    
    NUMBER_5160(new BigDecimal("5160")),
    
    NUMBER_5161(new BigDecimal("5161")),
    
    NUMBER_5162(new BigDecimal("5162")),
    
    NUMBER_5163(new BigDecimal("5163")),
    
    NUMBER_5164(new BigDecimal("5164")),
    
    NUMBER_5165(new BigDecimal("5165")),
    
    NUMBER_5166(new BigDecimal("5166")),
    
    NUMBER_5167(new BigDecimal("5167")),
    
    NUMBER_5168(new BigDecimal("5168")),
    
    NUMBER_5169(new BigDecimal("5169")),
    
    NUMBER_5170(new BigDecimal("5170")),
    
    NUMBER_5171(new BigDecimal("5171")),
    
    NUMBER_5172(new BigDecimal("5172")),
    
    NUMBER_5173(new BigDecimal("5173")),
    
    NUMBER_5174(new BigDecimal("5174")),
    
    NUMBER_5175(new BigDecimal("5175")),
    
    NUMBER_5176(new BigDecimal("5176")),
    
    NUMBER_5177(new BigDecimal("5177")),
    
    NUMBER_5178(new BigDecimal("5178")),
    
    NUMBER_5179(new BigDecimal("5179")),
    
    NUMBER_5180(new BigDecimal("5180")),
    
    NUMBER_5181(new BigDecimal("5181")),
    
    NUMBER_5182(new BigDecimal("5182")),
    
    NUMBER_5184(new BigDecimal("5184")),
    
    NUMBER_5185(new BigDecimal("5185")),
    
    NUMBER_5186(new BigDecimal("5186")),
    
    NUMBER_5187(new BigDecimal("5187")),
    
    NUMBER_5188(new BigDecimal("5188")),
    
    NUMBER_5189(new BigDecimal("5189")),
    
    NUMBER_5190(new BigDecimal("5190")),
    
    NUMBER_5191(new BigDecimal("5191")),
    
    NUMBER_5196(new BigDecimal("5196")),
    
    NUMBER_5198(new BigDecimal("5198")),
    
    NUMBER_5199(new BigDecimal("5199")),
    
    NUMBER_5200(new BigDecimal("5200")),
    
    NUMBER_5201(new BigDecimal("5201")),
    
    NUMBER_5202(new BigDecimal("5202")),
    
    NUMBER_5203(new BigDecimal("5203")),
    
    NUMBER_5204(new BigDecimal("5204")),
    
    NUMBER_5205(new BigDecimal("5205")),
    
    NUMBER_5206(new BigDecimal("5206")),
    
    NUMBER_5207(new BigDecimal("5207")),
    
    NUMBER_5211(new BigDecimal("5211")),
    
    NUMBER_5212(new BigDecimal("5212")),
    
    NUMBER_90001(new BigDecimal("90001")),
    
    NUMBER_90002(new BigDecimal("90002")),
    
    NUMBER_90003(new BigDecimal("90003")),
    
    NUMBER_90004(new BigDecimal("90004")),
    
    NUMBER_90005(new BigDecimal("90005")),
    
    NUMBER_90006(new BigDecimal("90006")),
    
    NUMBER_90007(new BigDecimal("90007")),
    
    NUMBER_90008(new BigDecimal("90008")),
    
    NUMBER_90009(new BigDecimal("90009")),
    
    NUMBER_90010(new BigDecimal("90010")),
    
    NUMBER_90011(new BigDecimal("90011"));

    private BigDecimal value;

    CodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(BigDecimal value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner() {
  }

  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code indicating the room amenity type.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#unitand-room-amenity-type-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt;
   * @return code
  **/
  @javax.annotation.Nonnull

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this amenity type in this room.
   * @return quantity
  **/
  @javax.annotation.Nonnull

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner = (PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner) o;
    return Objects.equals(this.code, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.code) &&
        Objects.equals(this.quantity, propertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner is not found in the empty JSON string", PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner>() {
           @Override
           public void write(JsonWriter out, PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner
  * @throws IOException if the JSON string is invalid with respect to PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner
  */
  public static PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner.class);
  }

 /**
  * Convert an instance of PropertiesPropertyIdGet200ResponsePropertyFacilityInfoGuestRoomListInnerAmenityListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

