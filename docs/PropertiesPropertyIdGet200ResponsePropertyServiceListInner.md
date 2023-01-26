

# PropertiesPropertyIdGet200ResponsePropertyServiceListInner

An object describing the service, its pricing and its availability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | The code of this service&lt;p&gt;See also &lt;a href&#x3D;\&quot;#servicecodes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; |  |
|**price** | **BigDecimal** | The surcharge for this service. |  |
|**exists** | **Boolean** | Whether this service is available. |  |
|**included** | **Boolean** | Whether this service is complementary. |  |
|**currencyCode** | [**CurrencyCodeEnum**](#CurrencyCodeEnum) | The currency of the surcharge for this service |  |
|**featureList** | [**List&lt;FeatureListEnum&gt;**](#List&lt;FeatureListEnum&gt;) | A list of features. |  |
|**typeList** | [**List&lt;TypeListEnum&gt;**](#List&lt;TypeListEnum&gt;) | A list of codes describing the available breakfast type.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#breakfasttype-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; |  |
|**itemList** | [**List&lt;ItemListEnum&gt;**](#List&lt;ItemListEnum&gt;) | A list of codes describing the available breakfast items.&lt;p&gt;See also &lt;a href&#x3D;\&quot;#breakfastitem-codes\&quot;&gt;in the appendix&lt;/a&gt;.&lt;/p&gt; |  |
|**operationTimeList** | [**List&lt;PropertiesPropertyIdGet200ResponsePropertyServiceListInnerOperationTimeListInner&gt;**](PropertiesPropertyIdGet200ResponsePropertyServiceListInnerOperationTimeListInner.md) | A list of operation times, including start and end times, and the days of the week on which the operation is open. |  |
|**name** | **String** | The name of this service. |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | new BigDecimal(&quot;1&quot;) |
| NUMBER_2 | new BigDecimal(&quot;2&quot;) |
| NUMBER_3 | new BigDecimal(&quot;3&quot;) |
| NUMBER_4 | new BigDecimal(&quot;4&quot;) |
| NUMBER_5 | new BigDecimal(&quot;5&quot;) |
| NUMBER_6 | new BigDecimal(&quot;6&quot;) |
| NUMBER_7 | new BigDecimal(&quot;7&quot;) |
| NUMBER_8 | new BigDecimal(&quot;8&quot;) |
| NUMBER_9 | new BigDecimal(&quot;9&quot;) |
| NUMBER_10 | new BigDecimal(&quot;10&quot;) |
| NUMBER_11 | new BigDecimal(&quot;11&quot;) |
| NUMBER_12 | new BigDecimal(&quot;12&quot;) |
| NUMBER_13 | new BigDecimal(&quot;13&quot;) |
| NUMBER_14 | new BigDecimal(&quot;14&quot;) |
| NUMBER_15 | new BigDecimal(&quot;15&quot;) |
| NUMBER_16 | new BigDecimal(&quot;16&quot;) |
| NUMBER_17 | new BigDecimal(&quot;17&quot;) |
| NUMBER_18 | new BigDecimal(&quot;18&quot;) |
| NUMBER_19 | new BigDecimal(&quot;19&quot;) |
| NUMBER_20 | new BigDecimal(&quot;20&quot;) |
| NUMBER_21 | new BigDecimal(&quot;21&quot;) |
| NUMBER_22 | new BigDecimal(&quot;22&quot;) |
| NUMBER_23 | new BigDecimal(&quot;23&quot;) |
| NUMBER_24 | new BigDecimal(&quot;24&quot;) |
| NUMBER_25 | new BigDecimal(&quot;25&quot;) |
| NUMBER_26 | new BigDecimal(&quot;26&quot;) |
| NUMBER_27 | new BigDecimal(&quot;27&quot;) |
| NUMBER_28 | new BigDecimal(&quot;28&quot;) |
| NUMBER_29 | new BigDecimal(&quot;29&quot;) |
| NUMBER_30 | new BigDecimal(&quot;30&quot;) |
| NUMBER_31 | new BigDecimal(&quot;31&quot;) |
| NUMBER_32 | new BigDecimal(&quot;32&quot;) |
| NUMBER_33 | new BigDecimal(&quot;33&quot;) |
| NUMBER_34 | new BigDecimal(&quot;34&quot;) |
| NUMBER_35 | new BigDecimal(&quot;35&quot;) |
| NUMBER_36 | new BigDecimal(&quot;36&quot;) |
| NUMBER_37 | new BigDecimal(&quot;37&quot;) |
| NUMBER_38 | new BigDecimal(&quot;38&quot;) |
| NUMBER_39 | new BigDecimal(&quot;39&quot;) |
| NUMBER_40 | new BigDecimal(&quot;40&quot;) |
| NUMBER_41 | new BigDecimal(&quot;41&quot;) |
| NUMBER_42 | new BigDecimal(&quot;42&quot;) |
| NUMBER_43 | new BigDecimal(&quot;43&quot;) |
| NUMBER_44 | new BigDecimal(&quot;44&quot;) |
| NUMBER_45 | new BigDecimal(&quot;45&quot;) |
| NUMBER_46 | new BigDecimal(&quot;46&quot;) |
| NUMBER_47 | new BigDecimal(&quot;47&quot;) |
| NUMBER_48 | new BigDecimal(&quot;48&quot;) |
| NUMBER_49 | new BigDecimal(&quot;49&quot;) |
| NUMBER_50 | new BigDecimal(&quot;50&quot;) |
| NUMBER_51 | new BigDecimal(&quot;51&quot;) |
| NUMBER_52 | new BigDecimal(&quot;52&quot;) |
| NUMBER_53 | new BigDecimal(&quot;53&quot;) |
| NUMBER_54 | new BigDecimal(&quot;54&quot;) |
| NUMBER_55 | new BigDecimal(&quot;55&quot;) |
| NUMBER_56 | new BigDecimal(&quot;56&quot;) |
| NUMBER_57 | new BigDecimal(&quot;57&quot;) |
| NUMBER_58 | new BigDecimal(&quot;58&quot;) |
| NUMBER_59 | new BigDecimal(&quot;59&quot;) |
| NUMBER_60 | new BigDecimal(&quot;60&quot;) |
| NUMBER_61 | new BigDecimal(&quot;61&quot;) |
| NUMBER_62 | new BigDecimal(&quot;62&quot;) |
| NUMBER_63 | new BigDecimal(&quot;63&quot;) |
| NUMBER_64 | new BigDecimal(&quot;64&quot;) |
| NUMBER_65 | new BigDecimal(&quot;65&quot;) |
| NUMBER_66 | new BigDecimal(&quot;66&quot;) |
| NUMBER_67 | new BigDecimal(&quot;67&quot;) |
| NUMBER_68 | new BigDecimal(&quot;68&quot;) |
| NUMBER_69 | new BigDecimal(&quot;69&quot;) |
| NUMBER_70 | new BigDecimal(&quot;70&quot;) |
| NUMBER_71 | new BigDecimal(&quot;71&quot;) |
| NUMBER_72 | new BigDecimal(&quot;72&quot;) |
| NUMBER_73 | new BigDecimal(&quot;73&quot;) |
| NUMBER_74 | new BigDecimal(&quot;74&quot;) |
| NUMBER_75 | new BigDecimal(&quot;75&quot;) |
| NUMBER_76 | new BigDecimal(&quot;76&quot;) |
| NUMBER_77 | new BigDecimal(&quot;77&quot;) |
| NUMBER_78 | new BigDecimal(&quot;78&quot;) |
| NUMBER_79 | new BigDecimal(&quot;79&quot;) |
| NUMBER_80 | new BigDecimal(&quot;80&quot;) |
| NUMBER_81 | new BigDecimal(&quot;81&quot;) |
| NUMBER_82 | new BigDecimal(&quot;82&quot;) |
| NUMBER_83 | new BigDecimal(&quot;83&quot;) |
| NUMBER_84 | new BigDecimal(&quot;84&quot;) |
| NUMBER_85 | new BigDecimal(&quot;85&quot;) |
| NUMBER_86 | new BigDecimal(&quot;86&quot;) |
| NUMBER_87 | new BigDecimal(&quot;87&quot;) |
| NUMBER_88 | new BigDecimal(&quot;88&quot;) |
| NUMBER_89 | new BigDecimal(&quot;89&quot;) |
| NUMBER_90 | new BigDecimal(&quot;90&quot;) |
| NUMBER_91 | new BigDecimal(&quot;91&quot;) |
| NUMBER_92 | new BigDecimal(&quot;92&quot;) |
| NUMBER_93 | new BigDecimal(&quot;93&quot;) |
| NUMBER_94 | new BigDecimal(&quot;94&quot;) |
| NUMBER_95 | new BigDecimal(&quot;95&quot;) |
| NUMBER_96 | new BigDecimal(&quot;96&quot;) |
| NUMBER_97 | new BigDecimal(&quot;97&quot;) |
| NUMBER_98 | new BigDecimal(&quot;98&quot;) |
| NUMBER_99 | new BigDecimal(&quot;99&quot;) |
| NUMBER_100 | new BigDecimal(&quot;100&quot;) |
| NUMBER_101 | new BigDecimal(&quot;101&quot;) |
| NUMBER_102 | new BigDecimal(&quot;102&quot;) |
| NUMBER_103 | new BigDecimal(&quot;103&quot;) |
| NUMBER_104 | new BigDecimal(&quot;104&quot;) |
| NUMBER_105 | new BigDecimal(&quot;105&quot;) |
| NUMBER_106 | new BigDecimal(&quot;106&quot;) |
| NUMBER_107 | new BigDecimal(&quot;107&quot;) |
| NUMBER_108 | new BigDecimal(&quot;108&quot;) |
| NUMBER_109 | new BigDecimal(&quot;109&quot;) |
| NUMBER_110 | new BigDecimal(&quot;110&quot;) |
| NUMBER_111 | new BigDecimal(&quot;111&quot;) |
| NUMBER_112 | new BigDecimal(&quot;112&quot;) |
| NUMBER_113 | new BigDecimal(&quot;113&quot;) |
| NUMBER_114 | new BigDecimal(&quot;114&quot;) |
| NUMBER_115 | new BigDecimal(&quot;115&quot;) |
| NUMBER_116 | new BigDecimal(&quot;116&quot;) |
| NUMBER_117 | new BigDecimal(&quot;117&quot;) |
| NUMBER_118 | new BigDecimal(&quot;118&quot;) |
| NUMBER_119 | new BigDecimal(&quot;119&quot;) |
| NUMBER_120 | new BigDecimal(&quot;120&quot;) |
| NUMBER_121 | new BigDecimal(&quot;121&quot;) |
| NUMBER_122 | new BigDecimal(&quot;122&quot;) |
| NUMBER_123 | new BigDecimal(&quot;123&quot;) |
| NUMBER_124 | new BigDecimal(&quot;124&quot;) |
| NUMBER_125 | new BigDecimal(&quot;125&quot;) |
| NUMBER_126 | new BigDecimal(&quot;126&quot;) |
| NUMBER_127 | new BigDecimal(&quot;127&quot;) |
| NUMBER_128 | new BigDecimal(&quot;128&quot;) |
| NUMBER_129 | new BigDecimal(&quot;129&quot;) |
| NUMBER_130 | new BigDecimal(&quot;130&quot;) |
| NUMBER_131 | new BigDecimal(&quot;131&quot;) |
| NUMBER_132 | new BigDecimal(&quot;132&quot;) |
| NUMBER_133 | new BigDecimal(&quot;133&quot;) |
| NUMBER_134 | new BigDecimal(&quot;134&quot;) |
| NUMBER_135 | new BigDecimal(&quot;135&quot;) |
| NUMBER_136 | new BigDecimal(&quot;136&quot;) |
| NUMBER_137 | new BigDecimal(&quot;137&quot;) |
| NUMBER_138 | new BigDecimal(&quot;138&quot;) |
| NUMBER_139 | new BigDecimal(&quot;139&quot;) |
| NUMBER_140 | new BigDecimal(&quot;140&quot;) |
| NUMBER_141 | new BigDecimal(&quot;141&quot;) |
| NUMBER_142 | new BigDecimal(&quot;142&quot;) |
| NUMBER_143 | new BigDecimal(&quot;143&quot;) |
| NUMBER_144 | new BigDecimal(&quot;144&quot;) |
| NUMBER_145 | new BigDecimal(&quot;145&quot;) |
| NUMBER_146 | new BigDecimal(&quot;146&quot;) |
| NUMBER_147 | new BigDecimal(&quot;147&quot;) |
| NUMBER_148 | new BigDecimal(&quot;148&quot;) |
| NUMBER_149 | new BigDecimal(&quot;149&quot;) |
| NUMBER_150 | new BigDecimal(&quot;150&quot;) |
| NUMBER_151 | new BigDecimal(&quot;151&quot;) |
| NUMBER_152 | new BigDecimal(&quot;152&quot;) |
| NUMBER_153 | new BigDecimal(&quot;153&quot;) |
| NUMBER_154 | new BigDecimal(&quot;154&quot;) |
| NUMBER_155 | new BigDecimal(&quot;155&quot;) |
| NUMBER_156 | new BigDecimal(&quot;156&quot;) |
| NUMBER_157 | new BigDecimal(&quot;157&quot;) |
| NUMBER_158 | new BigDecimal(&quot;158&quot;) |
| NUMBER_159 | new BigDecimal(&quot;159&quot;) |
| NUMBER_160 | new BigDecimal(&quot;160&quot;) |
| NUMBER_161 | new BigDecimal(&quot;161&quot;) |
| NUMBER_162 | new BigDecimal(&quot;162&quot;) |
| NUMBER_163 | new BigDecimal(&quot;163&quot;) |
| NUMBER_164 | new BigDecimal(&quot;164&quot;) |
| NUMBER_165 | new BigDecimal(&quot;165&quot;) |
| NUMBER_166 | new BigDecimal(&quot;166&quot;) |
| NUMBER_167 | new BigDecimal(&quot;167&quot;) |
| NUMBER_168 | new BigDecimal(&quot;168&quot;) |
| NUMBER_169 | new BigDecimal(&quot;169&quot;) |
| NUMBER_170 | new BigDecimal(&quot;170&quot;) |
| NUMBER_171 | new BigDecimal(&quot;171&quot;) |
| NUMBER_172 | new BigDecimal(&quot;172&quot;) |
| NUMBER_173 | new BigDecimal(&quot;173&quot;) |
| NUMBER_174 | new BigDecimal(&quot;174&quot;) |
| NUMBER_175 | new BigDecimal(&quot;175&quot;) |
| NUMBER_176 | new BigDecimal(&quot;176&quot;) |
| NUMBER_177 | new BigDecimal(&quot;177&quot;) |
| NUMBER_178 | new BigDecimal(&quot;178&quot;) |
| NUMBER_179 | new BigDecimal(&quot;179&quot;) |
| NUMBER_180 | new BigDecimal(&quot;180&quot;) |
| NUMBER_181 | new BigDecimal(&quot;181&quot;) |
| NUMBER_182 | new BigDecimal(&quot;182&quot;) |
| NUMBER_183 | new BigDecimal(&quot;183&quot;) |
| NUMBER_184 | new BigDecimal(&quot;184&quot;) |
| NUMBER_185 | new BigDecimal(&quot;185&quot;) |
| NUMBER_186 | new BigDecimal(&quot;186&quot;) |
| NUMBER_187 | new BigDecimal(&quot;187&quot;) |
| NUMBER_188 | new BigDecimal(&quot;188&quot;) |
| NUMBER_189 | new BigDecimal(&quot;189&quot;) |
| NUMBER_190 | new BigDecimal(&quot;190&quot;) |
| NUMBER_191 | new BigDecimal(&quot;191&quot;) |
| NUMBER_192 | new BigDecimal(&quot;192&quot;) |
| NUMBER_193 | new BigDecimal(&quot;193&quot;) |
| NUMBER_194 | new BigDecimal(&quot;194&quot;) |
| NUMBER_195 | new BigDecimal(&quot;195&quot;) |
| NUMBER_196 | new BigDecimal(&quot;196&quot;) |
| NUMBER_197 | new BigDecimal(&quot;197&quot;) |
| NUMBER_198 | new BigDecimal(&quot;198&quot;) |
| NUMBER_199 | new BigDecimal(&quot;199&quot;) |
| NUMBER_200 | new BigDecimal(&quot;200&quot;) |
| NUMBER_201 | new BigDecimal(&quot;201&quot;) |
| NUMBER_202 | new BigDecimal(&quot;202&quot;) |
| NUMBER_203 | new BigDecimal(&quot;203&quot;) |
| NUMBER_204 | new BigDecimal(&quot;204&quot;) |
| NUMBER_205 | new BigDecimal(&quot;205&quot;) |
| NUMBER_206 | new BigDecimal(&quot;206&quot;) |
| NUMBER_207 | new BigDecimal(&quot;207&quot;) |
| NUMBER_208 | new BigDecimal(&quot;208&quot;) |
| NUMBER_209 | new BigDecimal(&quot;209&quot;) |
| NUMBER_210 | new BigDecimal(&quot;210&quot;) |
| NUMBER_211 | new BigDecimal(&quot;211&quot;) |
| NUMBER_212 | new BigDecimal(&quot;212&quot;) |
| NUMBER_213 | new BigDecimal(&quot;213&quot;) |
| NUMBER_214 | new BigDecimal(&quot;214&quot;) |
| NUMBER_215 | new BigDecimal(&quot;215&quot;) |
| NUMBER_216 | new BigDecimal(&quot;216&quot;) |
| NUMBER_217 | new BigDecimal(&quot;217&quot;) |
| NUMBER_218 | new BigDecimal(&quot;218&quot;) |
| NUMBER_219 | new BigDecimal(&quot;219&quot;) |
| NUMBER_220 | new BigDecimal(&quot;220&quot;) |
| NUMBER_221 | new BigDecimal(&quot;221&quot;) |
| NUMBER_222 | new BigDecimal(&quot;222&quot;) |
| NUMBER_223 | new BigDecimal(&quot;223&quot;) |
| NUMBER_224 | new BigDecimal(&quot;224&quot;) |
| NUMBER_225 | new BigDecimal(&quot;225&quot;) |
| NUMBER_226 | new BigDecimal(&quot;226&quot;) |
| NUMBER_227 | new BigDecimal(&quot;227&quot;) |
| NUMBER_228 | new BigDecimal(&quot;228&quot;) |
| NUMBER_229 | new BigDecimal(&quot;229&quot;) |
| NUMBER_230 | new BigDecimal(&quot;230&quot;) |
| NUMBER_231 | new BigDecimal(&quot;231&quot;) |
| NUMBER_232 | new BigDecimal(&quot;232&quot;) |
| NUMBER_233 | new BigDecimal(&quot;233&quot;) |
| NUMBER_234 | new BigDecimal(&quot;234&quot;) |
| NUMBER_235 | new BigDecimal(&quot;235&quot;) |
| NUMBER_236 | new BigDecimal(&quot;236&quot;) |
| NUMBER_237 | new BigDecimal(&quot;237&quot;) |
| NUMBER_238 | new BigDecimal(&quot;238&quot;) |
| NUMBER_239 | new BigDecimal(&quot;239&quot;) |
| NUMBER_240 | new BigDecimal(&quot;240&quot;) |
| NUMBER_241 | new BigDecimal(&quot;241&quot;) |
| NUMBER_242 | new BigDecimal(&quot;242&quot;) |
| NUMBER_243 | new BigDecimal(&quot;243&quot;) |
| NUMBER_244 | new BigDecimal(&quot;244&quot;) |
| NUMBER_245 | new BigDecimal(&quot;245&quot;) |
| NUMBER_246 | new BigDecimal(&quot;246&quot;) |
| NUMBER_247 | new BigDecimal(&quot;247&quot;) |
| NUMBER_248 | new BigDecimal(&quot;248&quot;) |
| NUMBER_249 | new BigDecimal(&quot;249&quot;) |
| NUMBER_250 | new BigDecimal(&quot;250&quot;) |
| NUMBER_251 | new BigDecimal(&quot;251&quot;) |
| NUMBER_252 | new BigDecimal(&quot;252&quot;) |
| NUMBER_253 | new BigDecimal(&quot;253&quot;) |
| NUMBER_254 | new BigDecimal(&quot;254&quot;) |
| NUMBER_255 | new BigDecimal(&quot;255&quot;) |
| NUMBER_256 | new BigDecimal(&quot;256&quot;) |
| NUMBER_257 | new BigDecimal(&quot;257&quot;) |
| NUMBER_258 | new BigDecimal(&quot;258&quot;) |
| NUMBER_259 | new BigDecimal(&quot;259&quot;) |
| NUMBER_260 | new BigDecimal(&quot;260&quot;) |
| NUMBER_261 | new BigDecimal(&quot;261&quot;) |
| NUMBER_262 | new BigDecimal(&quot;262&quot;) |
| NUMBER_263 | new BigDecimal(&quot;263&quot;) |
| NUMBER_264 | new BigDecimal(&quot;264&quot;) |
| NUMBER_265 | new BigDecimal(&quot;265&quot;) |
| NUMBER_266 | new BigDecimal(&quot;266&quot;) |
| NUMBER_267 | new BigDecimal(&quot;267&quot;) |
| NUMBER_268 | new BigDecimal(&quot;268&quot;) |
| NUMBER_269 | new BigDecimal(&quot;269&quot;) |
| NUMBER_270 | new BigDecimal(&quot;270&quot;) |
| NUMBER_271 | new BigDecimal(&quot;271&quot;) |
| NUMBER_272 | new BigDecimal(&quot;272&quot;) |
| NUMBER_273 | new BigDecimal(&quot;273&quot;) |
| NUMBER_274 | new BigDecimal(&quot;274&quot;) |
| NUMBER_275 | new BigDecimal(&quot;275&quot;) |
| NUMBER_276 | new BigDecimal(&quot;276&quot;) |
| NUMBER_277 | new BigDecimal(&quot;277&quot;) |
| NUMBER_278 | new BigDecimal(&quot;278&quot;) |
| NUMBER_279 | new BigDecimal(&quot;279&quot;) |
| NUMBER_280 | new BigDecimal(&quot;280&quot;) |
| NUMBER_281 | new BigDecimal(&quot;281&quot;) |
| NUMBER_282 | new BigDecimal(&quot;282&quot;) |
| NUMBER_283 | new BigDecimal(&quot;283&quot;) |
| NUMBER_284 | new BigDecimal(&quot;284&quot;) |
| NUMBER_285 | new BigDecimal(&quot;285&quot;) |
| NUMBER_286 | new BigDecimal(&quot;286&quot;) |
| NUMBER_287 | new BigDecimal(&quot;287&quot;) |
| NUMBER_288 | new BigDecimal(&quot;288&quot;) |
| NUMBER_289 | new BigDecimal(&quot;289&quot;) |
| NUMBER_290 | new BigDecimal(&quot;290&quot;) |
| NUMBER_291 | new BigDecimal(&quot;291&quot;) |
| NUMBER_292 | new BigDecimal(&quot;292&quot;) |
| NUMBER_293 | new BigDecimal(&quot;293&quot;) |
| NUMBER_294 | new BigDecimal(&quot;294&quot;) |
| NUMBER_295 | new BigDecimal(&quot;295&quot;) |
| NUMBER_296 | new BigDecimal(&quot;296&quot;) |
| NUMBER_297 | new BigDecimal(&quot;297&quot;) |
| NUMBER_298 | new BigDecimal(&quot;298&quot;) |
| NUMBER_299 | new BigDecimal(&quot;299&quot;) |
| NUMBER_300 | new BigDecimal(&quot;300&quot;) |
| NUMBER_301 | new BigDecimal(&quot;301&quot;) |
| NUMBER_302 | new BigDecimal(&quot;302&quot;) |
| NUMBER_303 | new BigDecimal(&quot;303&quot;) |
| NUMBER_304 | new BigDecimal(&quot;304&quot;) |
| NUMBER_305 | new BigDecimal(&quot;305&quot;) |
| NUMBER_306 | new BigDecimal(&quot;306&quot;) |
| NUMBER_307 | new BigDecimal(&quot;307&quot;) |
| NUMBER_308 | new BigDecimal(&quot;308&quot;) |
| NUMBER_309 | new BigDecimal(&quot;309&quot;) |
| NUMBER_310 | new BigDecimal(&quot;310&quot;) |
| NUMBER_311 | new BigDecimal(&quot;311&quot;) |
| NUMBER_312 | new BigDecimal(&quot;312&quot;) |
| NUMBER_313 | new BigDecimal(&quot;313&quot;) |
| NUMBER_314 | new BigDecimal(&quot;314&quot;) |
| NUMBER_315 | new BigDecimal(&quot;315&quot;) |
| NUMBER_316 | new BigDecimal(&quot;316&quot;) |
| NUMBER_317 | new BigDecimal(&quot;317&quot;) |
| NUMBER_318 | new BigDecimal(&quot;318&quot;) |
| NUMBER_319 | new BigDecimal(&quot;319&quot;) |
| NUMBER_320 | new BigDecimal(&quot;320&quot;) |
| NUMBER_321 | new BigDecimal(&quot;321&quot;) |
| NUMBER_322 | new BigDecimal(&quot;322&quot;) |
| NUMBER_323 | new BigDecimal(&quot;323&quot;) |
| NUMBER_324 | new BigDecimal(&quot;324&quot;) |
| NUMBER_325 | new BigDecimal(&quot;325&quot;) |
| NUMBER_326 | new BigDecimal(&quot;326&quot;) |
| NUMBER_327 | new BigDecimal(&quot;327&quot;) |
| NUMBER_328 | new BigDecimal(&quot;328&quot;) |
| NUMBER_329 | new BigDecimal(&quot;329&quot;) |
| NUMBER_331 | new BigDecimal(&quot;331&quot;) |
| NUMBER_332 | new BigDecimal(&quot;332&quot;) |
| NUMBER_333 | new BigDecimal(&quot;333&quot;) |
| NUMBER_334 | new BigDecimal(&quot;334&quot;) |
| NUMBER_335 | new BigDecimal(&quot;335&quot;) |
| NUMBER_336 | new BigDecimal(&quot;336&quot;) |
| NUMBER_337 | new BigDecimal(&quot;337&quot;) |
| NUMBER_338 | new BigDecimal(&quot;338&quot;) |
| NUMBER_339 | new BigDecimal(&quot;339&quot;) |
| NUMBER_340 | new BigDecimal(&quot;340&quot;) |
| NUMBER_341 | new BigDecimal(&quot;341&quot;) |
| NUMBER_342 | new BigDecimal(&quot;342&quot;) |
| NUMBER_343 | new BigDecimal(&quot;343&quot;) |
| NUMBER_344 | new BigDecimal(&quot;344&quot;) |
| NUMBER_345 | new BigDecimal(&quot;345&quot;) |
| NUMBER_348 | new BigDecimal(&quot;348&quot;) |
| NUMBER_349 | new BigDecimal(&quot;349&quot;) |
| NUMBER_350 | new BigDecimal(&quot;350&quot;) |
| NUMBER_351 | new BigDecimal(&quot;351&quot;) |
| NUMBER_5000 | new BigDecimal(&quot;5000&quot;) |
| NUMBER_5001 | new BigDecimal(&quot;5001&quot;) |
| NUMBER_5002 | new BigDecimal(&quot;5002&quot;) |
| NUMBER_5003 | new BigDecimal(&quot;5003&quot;) |
| NUMBER_5004 | new BigDecimal(&quot;5004&quot;) |
| NUMBER_5005 | new BigDecimal(&quot;5005&quot;) |
| NUMBER_5006 | new BigDecimal(&quot;5006&quot;) |
| NUMBER_5007 | new BigDecimal(&quot;5007&quot;) |
| NUMBER_5008 | new BigDecimal(&quot;5008&quot;) |
| NUMBER_5009 | new BigDecimal(&quot;5009&quot;) |
| NUMBER_5010 | new BigDecimal(&quot;5010&quot;) |
| NUMBER_5011 | new BigDecimal(&quot;5011&quot;) |
| NUMBER_5012 | new BigDecimal(&quot;5012&quot;) |
| NUMBER_5013 | new BigDecimal(&quot;5013&quot;) |
| NUMBER_5014 | new BigDecimal(&quot;5014&quot;) |
| NUMBER_5015 | new BigDecimal(&quot;5015&quot;) |
| NUMBER_5016 | new BigDecimal(&quot;5016&quot;) |
| NUMBER_5017 | new BigDecimal(&quot;5017&quot;) |
| NUMBER_5018 | new BigDecimal(&quot;5018&quot;) |
| NUMBER_5020 | new BigDecimal(&quot;5020&quot;) |
| NUMBER_5021 | new BigDecimal(&quot;5021&quot;) |
| NUMBER_5022 | new BigDecimal(&quot;5022&quot;) |
| NUMBER_5023 | new BigDecimal(&quot;5023&quot;) |
| NUMBER_5024 | new BigDecimal(&quot;5024&quot;) |
| NUMBER_5025 | new BigDecimal(&quot;5025&quot;) |
| NUMBER_5026 | new BigDecimal(&quot;5026&quot;) |
| NUMBER_5027 | new BigDecimal(&quot;5027&quot;) |
| NUMBER_5028 | new BigDecimal(&quot;5028&quot;) |
| NUMBER_5029 | new BigDecimal(&quot;5029&quot;) |
| NUMBER_5030 | new BigDecimal(&quot;5030&quot;) |
| NUMBER_5031 | new BigDecimal(&quot;5031&quot;) |
| NUMBER_5032 | new BigDecimal(&quot;5032&quot;) |
| NUMBER_5033 | new BigDecimal(&quot;5033&quot;) |
| NUMBER_5034 | new BigDecimal(&quot;5034&quot;) |
| NUMBER_5035 | new BigDecimal(&quot;5035&quot;) |
| NUMBER_5036 | new BigDecimal(&quot;5036&quot;) |
| NUMBER_5037 | new BigDecimal(&quot;5037&quot;) |
| NUMBER_5039 | new BigDecimal(&quot;5039&quot;) |
| NUMBER_5040 | new BigDecimal(&quot;5040&quot;) |
| NUMBER_5041 | new BigDecimal(&quot;5041&quot;) |
| NUMBER_5042 | new BigDecimal(&quot;5042&quot;) |
| NUMBER_5043 | new BigDecimal(&quot;5043&quot;) |
| NUMBER_5044 | new BigDecimal(&quot;5044&quot;) |
| NUMBER_5045 | new BigDecimal(&quot;5045&quot;) |
| NUMBER_5046 | new BigDecimal(&quot;5046&quot;) |
| NUMBER_5047 | new BigDecimal(&quot;5047&quot;) |
| NUMBER_5048 | new BigDecimal(&quot;5048&quot;) |
| NUMBER_5049 | new BigDecimal(&quot;5049&quot;) |
| NUMBER_5050 | new BigDecimal(&quot;5050&quot;) |
| NUMBER_5051 | new BigDecimal(&quot;5051&quot;) |
| NUMBER_5052 | new BigDecimal(&quot;5052&quot;) |
| NUMBER_5053 | new BigDecimal(&quot;5053&quot;) |
| NUMBER_5054 | new BigDecimal(&quot;5054&quot;) |
| NUMBER_5055 | new BigDecimal(&quot;5055&quot;) |
| NUMBER_5056 | new BigDecimal(&quot;5056&quot;) |
| NUMBER_5057 | new BigDecimal(&quot;5057&quot;) |
| NUMBER_5058 | new BigDecimal(&quot;5058&quot;) |
| NUMBER_5059 | new BigDecimal(&quot;5059&quot;) |
| NUMBER_5060 | new BigDecimal(&quot;5060&quot;) |
| NUMBER_5061 | new BigDecimal(&quot;5061&quot;) |
| NUMBER_5062 | new BigDecimal(&quot;5062&quot;) |
| NUMBER_5063 | new BigDecimal(&quot;5063&quot;) |
| NUMBER_5064 | new BigDecimal(&quot;5064&quot;) |
| NUMBER_5065 | new BigDecimal(&quot;5065&quot;) |
| NUMBER_5066 | new BigDecimal(&quot;5066&quot;) |
| NUMBER_5067 | new BigDecimal(&quot;5067&quot;) |
| NUMBER_5068 | new BigDecimal(&quot;5068&quot;) |
| NUMBER_5069 | new BigDecimal(&quot;5069&quot;) |
| NUMBER_5070 | new BigDecimal(&quot;5070&quot;) |
| NUMBER_5071 | new BigDecimal(&quot;5071&quot;) |
| NUMBER_5072 | new BigDecimal(&quot;5072&quot;) |
| NUMBER_5073 | new BigDecimal(&quot;5073&quot;) |
| NUMBER_5074 | new BigDecimal(&quot;5074&quot;) |
| NUMBER_5075 | new BigDecimal(&quot;5075&quot;) |
| NUMBER_5076 | new BigDecimal(&quot;5076&quot;) |
| NUMBER_5077 | new BigDecimal(&quot;5077&quot;) |
| NUMBER_5078 | new BigDecimal(&quot;5078&quot;) |
| NUMBER_5079 | new BigDecimal(&quot;5079&quot;) |
| NUMBER_5080 | new BigDecimal(&quot;5080&quot;) |
| NUMBER_5081 | new BigDecimal(&quot;5081&quot;) |
| NUMBER_5082 | new BigDecimal(&quot;5082&quot;) |
| NUMBER_5083 | new BigDecimal(&quot;5083&quot;) |
| NUMBER_5084 | new BigDecimal(&quot;5084&quot;) |
| NUMBER_5085 | new BigDecimal(&quot;5085&quot;) |
| NUMBER_5086 | new BigDecimal(&quot;5086&quot;) |
| NUMBER_5087 | new BigDecimal(&quot;5087&quot;) |
| NUMBER_5088 | new BigDecimal(&quot;5088&quot;) |
| NUMBER_5089 | new BigDecimal(&quot;5089&quot;) |
| NUMBER_5090 | new BigDecimal(&quot;5090&quot;) |
| NUMBER_5091 | new BigDecimal(&quot;5091&quot;) |
| NUMBER_5092 | new BigDecimal(&quot;5092&quot;) |
| NUMBER_5093 | new BigDecimal(&quot;5093&quot;) |
| NUMBER_5094 | new BigDecimal(&quot;5094&quot;) |
| NUMBER_5095 | new BigDecimal(&quot;5095&quot;) |
| NUMBER_5096 | new BigDecimal(&quot;5096&quot;) |
| NUMBER_5097 | new BigDecimal(&quot;5097&quot;) |
| NUMBER_5098 | new BigDecimal(&quot;5098&quot;) |
| NUMBER_5099 | new BigDecimal(&quot;5099&quot;) |
| NUMBER_5100 | new BigDecimal(&quot;5100&quot;) |
| NUMBER_5101 | new BigDecimal(&quot;5101&quot;) |
| NUMBER_5102 | new BigDecimal(&quot;5102&quot;) |
| NUMBER_5103 | new BigDecimal(&quot;5103&quot;) |
| NUMBER_5104 | new BigDecimal(&quot;5104&quot;) |
| NUMBER_5105 | new BigDecimal(&quot;5105&quot;) |
| NUMBER_5106 | new BigDecimal(&quot;5106&quot;) |
| NUMBER_5107 | new BigDecimal(&quot;5107&quot;) |
| NUMBER_5108 | new BigDecimal(&quot;5108&quot;) |
| NUMBER_5109 | new BigDecimal(&quot;5109&quot;) |
| NUMBER_5110 | new BigDecimal(&quot;5110&quot;) |
| NUMBER_5111 | new BigDecimal(&quot;5111&quot;) |
| NUMBER_5112 | new BigDecimal(&quot;5112&quot;) |
| NUMBER_5113 | new BigDecimal(&quot;5113&quot;) |
| NUMBER_5114 | new BigDecimal(&quot;5114&quot;) |
| NUMBER_5115 | new BigDecimal(&quot;5115&quot;) |
| NUMBER_5116 | new BigDecimal(&quot;5116&quot;) |
| NUMBER_5117 | new BigDecimal(&quot;5117&quot;) |
| NUMBER_5118 | new BigDecimal(&quot;5118&quot;) |
| NUMBER_5119 | new BigDecimal(&quot;5119&quot;) |
| NUMBER_5120 | new BigDecimal(&quot;5120&quot;) |
| NUMBER_5121 | new BigDecimal(&quot;5121&quot;) |
| NUMBER_5122 | new BigDecimal(&quot;5122&quot;) |
| NUMBER_5123 | new BigDecimal(&quot;5123&quot;) |
| NUMBER_5124 | new BigDecimal(&quot;5124&quot;) |
| NUMBER_5125 | new BigDecimal(&quot;5125&quot;) |
| NUMBER_5126 | new BigDecimal(&quot;5126&quot;) |
| NUMBER_5127 | new BigDecimal(&quot;5127&quot;) |
| NUMBER_5128 | new BigDecimal(&quot;5128&quot;) |
| NUMBER_5129 | new BigDecimal(&quot;5129&quot;) |
| NUMBER_5130 | new BigDecimal(&quot;5130&quot;) |
| NUMBER_5131 | new BigDecimal(&quot;5131&quot;) |
| NUMBER_5132 | new BigDecimal(&quot;5132&quot;) |
| NUMBER_5133 | new BigDecimal(&quot;5133&quot;) |
| NUMBER_5134 | new BigDecimal(&quot;5134&quot;) |
| NUMBER_5135 | new BigDecimal(&quot;5135&quot;) |
| NUMBER_5136 | new BigDecimal(&quot;5136&quot;) |
| NUMBER_5137 | new BigDecimal(&quot;5137&quot;) |
| NUMBER_5138 | new BigDecimal(&quot;5138&quot;) |
| NUMBER_5139 | new BigDecimal(&quot;5139&quot;) |
| NUMBER_5140 | new BigDecimal(&quot;5140&quot;) |
| NUMBER_5141 | new BigDecimal(&quot;5141&quot;) |
| NUMBER_5142 | new BigDecimal(&quot;5142&quot;) |
| NUMBER_5143 | new BigDecimal(&quot;5143&quot;) |
| NUMBER_5144 | new BigDecimal(&quot;5144&quot;) |
| NUMBER_5145 | new BigDecimal(&quot;5145&quot;) |
| NUMBER_5146 | new BigDecimal(&quot;5146&quot;) |
| NUMBER_5147 | new BigDecimal(&quot;5147&quot;) |
| NUMBER_5148 | new BigDecimal(&quot;5148&quot;) |
| NUMBER_5149 | new BigDecimal(&quot;5149&quot;) |
| NUMBER_5150 | new BigDecimal(&quot;5150&quot;) |
| NUMBER_5151 | new BigDecimal(&quot;5151&quot;) |
| NUMBER_5152 | new BigDecimal(&quot;5152&quot;) |
| NUMBER_5153 | new BigDecimal(&quot;5153&quot;) |
| NUMBER_5154 | new BigDecimal(&quot;5154&quot;) |
| NUMBER_5156 | new BigDecimal(&quot;5156&quot;) |
| NUMBER_5157 | new BigDecimal(&quot;5157&quot;) |
| NUMBER_5158 | new BigDecimal(&quot;5158&quot;) |
| NUMBER_5159 | new BigDecimal(&quot;5159&quot;) |
| NUMBER_5160 | new BigDecimal(&quot;5160&quot;) |
| NUMBER_5161 | new BigDecimal(&quot;5161&quot;) |
| NUMBER_5162 | new BigDecimal(&quot;5162&quot;) |
| NUMBER_5163 | new BigDecimal(&quot;5163&quot;) |
| NUMBER_5164 | new BigDecimal(&quot;5164&quot;) |
| NUMBER_5165 | new BigDecimal(&quot;5165&quot;) |
| NUMBER_5166 | new BigDecimal(&quot;5166&quot;) |
| NUMBER_5167 | new BigDecimal(&quot;5167&quot;) |
| NUMBER_5168 | new BigDecimal(&quot;5168&quot;) |
| NUMBER_5169 | new BigDecimal(&quot;5169&quot;) |
| NUMBER_5170 | new BigDecimal(&quot;5170&quot;) |
| NUMBER_5171 | new BigDecimal(&quot;5171&quot;) |
| NUMBER_5172 | new BigDecimal(&quot;5172&quot;) |
| NUMBER_5173 | new BigDecimal(&quot;5173&quot;) |
| NUMBER_5174 | new BigDecimal(&quot;5174&quot;) |
| NUMBER_5175 | new BigDecimal(&quot;5175&quot;) |
| NUMBER_5176 | new BigDecimal(&quot;5176&quot;) |
| NUMBER_5177 | new BigDecimal(&quot;5177&quot;) |
| NUMBER_5178 | new BigDecimal(&quot;5178&quot;) |
| NUMBER_6000 | new BigDecimal(&quot;6000&quot;) |
| NUMBER_6001 | new BigDecimal(&quot;6001&quot;) |
| NUMBER_90001 | new BigDecimal(&quot;90001&quot;) |



## Enum: CurrencyCodeEnum

| Name | Value |
|---- | -----|
| AED | &quot;AED&quot; |
| ARS | &quot;ARS&quot; |
| AUD | &quot;AUD&quot; |
| AZN | &quot;AZN&quot; |
| BGN | &quot;BGN&quot; |
| BHD | &quot;BHD&quot; |
| BRL | &quot;BRL&quot; |
| CAD | &quot;CAD&quot; |
| CHF | &quot;CHF&quot; |
| CLP | &quot;CLP&quot; |
| CNY | &quot;CNY&quot; |
| COP | &quot;COP&quot; |
| CZK | &quot;CZK&quot; |
| DKK | &quot;DKK&quot; |
| EGP | &quot;EGP&quot; |
| EUR | &quot;EUR&quot; |
| FJD | &quot;FJD&quot; |
| GBP | &quot;GBP&quot; |
| GEL | &quot;GEL&quot; |
| HKD | &quot;HKD&quot; |
| HUF | &quot;HUF&quot; |
| IDR | &quot;IDR&quot; |
| ILS | &quot;ILS&quot; |
| INR | &quot;INR&quot; |
| JOD | &quot;JOD&quot; |
| JPY | &quot;JPY&quot; |
| KRW | &quot;KRW&quot; |
| KWD | &quot;KWD&quot; |
| KZT | &quot;KZT&quot; |
| MDL | &quot;MDL&quot; |
| MXN | &quot;MXN&quot; |
| MYR | &quot;MYR&quot; |
| NAD | &quot;NAD&quot; |
| NOK | &quot;NOK&quot; |
| NZD | &quot;NZD&quot; |
| OMR | &quot;OMR&quot; |
| PLN | &quot;PLN&quot; |
| QAR | &quot;QAR&quot; |
| RON | &quot;RON&quot; |
| RUB | &quot;RUB&quot; |
| SAR | &quot;SAR&quot; |
| SEK | &quot;SEK&quot; |
| SGD | &quot;SGD&quot; |
| THB | &quot;THB&quot; |
| TRY | &quot;TRY&quot; |
| TWD | &quot;TWD&quot; |
| UAH | &quot;UAH&quot; |
| USD | &quot;USD&quot; |
| XOF | &quot;XOF&quot; |
| ZAR | &quot;ZAR&quot; |



## Enum: List&lt;FeatureListEnum&gt;

| Name | Value |
|---- | -----|
| A_LA_CARTE | &quot;a_la_carte&quot; |
| BUFFET | &quot;buffet&quot; |
| GUESTS_ONLY | &quot;guests_only&quot; |
| ACCEPTS_RESERVATIONS | &quot;accepts_reservations&quot; |
| OUTDOOR_SEATING | &quot;outdoor_seating&quot; |



## Enum: List&lt;TypeListEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_5001 | new BigDecimal(&quot;5001&quot;) |
| NUMBER_5002 | new BigDecimal(&quot;5002&quot;) |
| NUMBER_5003 | new BigDecimal(&quot;5003&quot;) |
| NUMBER_5004 | new BigDecimal(&quot;5004&quot;) |
| NUMBER_5005 | new BigDecimal(&quot;5005&quot;) |
| NUMBER_5006 | new BigDecimal(&quot;5006&quot;) |
| NUMBER_5007 | new BigDecimal(&quot;5007&quot;) |
| NUMBER_5008 | new BigDecimal(&quot;5008&quot;) |
| NUMBER_5009 | new BigDecimal(&quot;5009&quot;) |
| NUMBER_5010 | new BigDecimal(&quot;5010&quot;) |
| NUMBER_5011 | new BigDecimal(&quot;5011&quot;) |
| NUMBER_5012 | new BigDecimal(&quot;5012&quot;) |



## Enum: List&lt;ItemListEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_5001 | new BigDecimal(&quot;5001&quot;) |
| NUMBER_5002 | new BigDecimal(&quot;5002&quot;) |
| NUMBER_5003 | new BigDecimal(&quot;5003&quot;) |
| NUMBER_5004 | new BigDecimal(&quot;5004&quot;) |
| NUMBER_5005 | new BigDecimal(&quot;5005&quot;) |
| NUMBER_5006 | new BigDecimal(&quot;5006&quot;) |
| NUMBER_5007 | new BigDecimal(&quot;5007&quot;) |
| NUMBER_5008 | new BigDecimal(&quot;5008&quot;) |
| NUMBER_5009 | new BigDecimal(&quot;5009&quot;) |
| NUMBER_5010 | new BigDecimal(&quot;5010&quot;) |
| NUMBER_5011 | new BigDecimal(&quot;5011&quot;) |
| NUMBER_5012 | new BigDecimal(&quot;5012&quot;) |
| NUMBER_5013 | new BigDecimal(&quot;5013&quot;) |
| NUMBER_5014 | new BigDecimal(&quot;5014&quot;) |
| NUMBER_5015 | new BigDecimal(&quot;5015&quot;) |
| NUMBER_5016 | new BigDecimal(&quot;5016&quot;) |
| NUMBER_5017 | new BigDecimal(&quot;5017&quot;) |
| NUMBER_5018 | new BigDecimal(&quot;5018&quot;) |
| NUMBER_5019 | new BigDecimal(&quot;5019&quot;) |



