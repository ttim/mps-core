<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:fc8cebf1-3657-45a2-ae1b-3a6557f438b7(jetbrains.mps.core.sandbox.template)" doNotGenerate="true">
  <persistence version="7" />
  <language namespace="c898d4a2-ef8e-481f-aff5-15e46db05e03(jetbrains.mps.core.query)" />
  <language namespace="2e142477-d221-495b-aa6c-7bd7c349e904(jetbrains.mps.core.template)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="78c70cc5-3e2a-478b-9524-f2d47690ac85(jetbrains.mps.core.workflow)" />
  <language namespace="41a590b4-0cca-40d1-9a11-d9ef253734cc(jetbrains.mps.core.smodel)" />
  <import index="1ulq" modelUID="r:832e0baa-411d-4487-afdf-7fc210c943c1(jetbrains.mps.core.sandbox.structure)" version="-1" />
  <import index="bwy9" modelUID="r:f9198ffd-e084-425c-aa82-f2db8289f5eb(jetbrains.mps.core.query.structure)" version="0" implicit="yes" />
  <import index="h0os" modelUID="r:d290b86d-8b61-4a2f-a17f-263226953ecc(jetbrains.mps.core.template.structure)" version="0" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="e5td" modelUID="r:ebf59dd9-04f3-4209-8dd7-dca3f04cac82(jetbrains.mps.core.workflow.structure)" version="0" implicit="yes" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="xsnc" modelUID="r:e3b9700d-5825-4641-895a-925f28591c5b(jetbrains.mps.core.smodel.structure)" version="-1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <roots>
    <node type="bwy9.MqlPackage" typeId="bwy9.6762883159245048630" id="6601450967974137522">
      <property name="name" nameId="tpck.1169194664001" value="default" />
    </node>
    <node type="h0os.MtlLibrary" typeId="h0os.212212067811886747" id="212212067812146067">
      <property name="name" nameId="tpck.1169194664001" value="toString" />
    </node>
    <node type="e5td.WflowExecutable" typeId="e5td.3373821274546687033" id="3373821274546690914">
      <property name="name" nameId="tpck.1169194664001" value="collectionsTest" />
    </node>
    <node type="bwy9.MqlPackage" typeId="bwy9.6762883159245048630" id="5109194352282883599">
      <property name="name" nameId="tpck.1169194664001" value="util" />
    </node>
  </roots>
  <root id="6601450967974137522">
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="6601450967974137525">
      <property name="name" nameId="tpck.1169194664001" value="qqq" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="6601450967974157920">
        <property name="name" nameId="tpck.1169194664001" value="temp" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlFunctionType" typeId="bwy9.6762883159245048080" id="6601450967974157924">
          <node role="returnType" roleId="bwy9.6762883159245048081" type="bwy9.MqlIntType" typeId="bwy9.6762883159245048069" id="6601450967974157926" />
        </node>
      </node>
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="6601450967974157929">
        <property name="name" nameId="tpck.1169194664001" value="aa" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlIntType" typeId="bwy9.6762883159245048069" id="6601450967974157931" />
      </node>
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlThis" typeId="bwy9.6762883159245048067" id="6601450967974137537" />
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="6601450967974208008">
      <property name="name" nameId="tpck.1169194664001" value="getString" />
      <property name="isCached" nameId="bwy9.212212067811886758" value="false" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlStringLiteral" typeId="bwy9.6762883159245048054" id="6601450967974208011">
        <property name="value" nameId="bwy9.6762883159245048055" value="sdgsf" />
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="6601450967974210856">
      <property name="name" nameId="tpck.1169194664001" value="getNull" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlNullLiteral" typeId="bwy9.6762883159245048062" id="228266671027692240" />
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="228266671027692241">
      <property name="name" nameId="tpck.1169194664001" value="getBoolean" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="228266671027811803">
        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="228266671027811804">
      <property name="name" nameId="tpck.1169194664001" value="getInt" />
      <property name="isCached" nameId="bwy9.212212067811886758" value="true" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="228266671027811806">
        <property name="value" nameId="bwy9.6762883159245048053" value="123" />
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="228266671027811813">
      <property name="name" nameId="tpck.1169194664001" value="first" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlParentheses" typeId="bwy9.6762883159245048022" id="228266671027841813">
        <node role="expr" roleId="bwy9.6762883159245048023" type="bwy9.MqlClosure" typeId="bwy9.6762883159245086414" id="228266671027841815">
          <node role="body" roleId="bwy9.6762883159245086416" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="228266671027848204">
            <property name="kind" nameId="bwy9.6762883159245048047" value="4" />
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="228266671027848207">
              <property name="value" nameId="bwy9.6762883159245048053" value="1" />
            </node>
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlUnary" typeId="bwy9.6762883159245048034" id="228266671027848209">
              <property name="kind" nameId="bwy9.6762883159245048039" value="2" />
              <node role="expr" roleId="bwy9.6762883159245048038" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="228266671027848213">
                <property name="value" nameId="bwy9.6762883159245048053" value="1" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="228266671027848216">
      <property name="name" nameId="tpck.1169194664001" value="getProperties" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="228266671027905035">
        <property name="name" nameId="tpck.1169194664001" value="decl" />
        <node role="type" roleId="bwy9.6762883159245086405" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114545456">
          <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074039" resolveInfo="CharacterReader" />
        </node>
      </node>
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="2852142168179598247">
        <property name="name" nameId="tpck.1169194664001" value="i" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlIntType" typeId="bwy9.6762883159245048069" id="2852142168179598249" />
      </node>
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="2059702675525965889">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="2059702675525965888">
          <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="228266671027905035" resolveInfo="decl" />
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="xsnc.MqlLinkSelector" typeId="xsnc.4260762357824841781" id="6960281617114545459">
          <link role="link" roleId="xsnc.4260762357824841782" targetNodeId="1ulq.7581772527308056983" resolveInfo="props" />
        </node>
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="2059702675525965901">
      <property name="name" nameId="tpck.1169194664001" value="getPropertyNames" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="2059702675525982937">
        <property name="name" nameId="tpck.1169194664001" value="decl" />
        <node role="type" roleId="bwy9.6762883159245086405" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114545457">
          <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074039" resolveInfo="CharacterReader" />
        </node>
      </node>
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="535637396506549423">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="2059702675525983613">
          <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="2059702675525982930">
            <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="228266671027848216" resolveInfo="getProperties" />
            <node role="arguments" roleId="bwy9.2059702675525965926" type="bwy9.MqlNullLiteral" typeId="bwy9.6762883159245048062" id="6960281617114545460" />
            <node role="arguments" roleId="bwy9.2059702675525965926" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179609474">
              <property name="value" nameId="bwy9.6762883159245048053" value="1" />
            </node>
          </node>
          <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="535637396506549422">
            <property name="kind" nameId="bwy9.5280308256730609813" value="2" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="xsnc.MqlLinkSelector" typeId="xsnc.4260762357824841781" id="535637396506549427">
          <link role="link" roleId="xsnc.4260762357824841782" targetNodeId="1ulq.2223786200032662875" resolveInfo="ref" />
        </node>
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="5280308256730728612">
      <property name="name" nameId="tpck.1169194664001" value="filter" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="5280308256730792761">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="5280308256730756641">
          <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="5280308256730753231">
            <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="5280308256730728614" resolveInfo="x" />
          </node>
          <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="5280308256730756645">
            <property name="kind" nameId="bwy9.5280308256730478253" value="4" />
            <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="5280308256730756646">
              <property name="name" nameId="tpck.1169194664001" value="it" />
            </node>
            <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="5280308256730798691">
              <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="5280308256730798683">
                <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="5280308256730792777">
                  <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="5280308256730756646" resolveInfo="it" />
                </node>
                <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="5280308256730798687">
                  <property name="kind" nameId="bwy9.5280308256730609813" value="1" />
                </node>
              </node>
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="5280308256730798694">
                <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="5280308256730753227" resolveInfo="min" />
              </node>
            </node>
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="5280308256730798695">
          <property name="kind" nameId="bwy9.5280308256730478253" value="7" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="5280308256730798696">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="5280308256730798703">
            <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="5280308256730798698">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="5280308256730798696" resolveInfo="it" />
            </node>
            <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="5280308256730798707">
              <property name="kind" nameId="bwy9.5280308256730609813" value="1" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="5280308256730728614">
        <property name="name" nameId="tpck.1169194664001" value="x" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlListType" typeId="bwy9.6762883159245048068" id="5280308256730728615">
          <node role="inner" roleId="bwy9.6762883159245048071" type="bwy9.MqlListType" typeId="bwy9.6762883159245048068" id="5280308256730798680">
            <node role="inner" roleId="bwy9.6762883159245048071" type="bwy9.MqlStringType" typeId="bwy9.6762883159245048070" id="5280308256730798682" />
          </node>
        </node>
      </node>
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="5280308256730753227">
        <property name="name" nameId="tpck.1169194664001" value="min" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlIntType" typeId="bwy9.6762883159245048069" id="5280308256730753229" />
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="2268293679705614739">
      <property name="name" nameId="tpck.1169194664001" value="testComma" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2268293679705627779">
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="3435983127247167780">
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2268293679705663629">
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2268293679705663641">
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2852142168179579027">
                <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlTriplex" typeId="bwy9.6762883159245048058" id="2852142168179579055">
                  <node role="thenexpr" roleId="bwy9.6762883159245048060" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="2852142168179579059">
                    <property name="value" nameId="bwy9.6762883159245048057" value="true" />
                  </node>
                  <node role="elseexpr" roleId="bwy9.6762883159245048061" type="bwy9.MqlParentheses" typeId="bwy9.6762883159245048022" id="2852142168179598253">
                    <node role="expr" roleId="bwy9.6762883159245048023" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2852142168179598250">
                      <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="2852142168179598254">
                        <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="228266671027848216" resolveInfo="getProperties" />
                        <node role="arguments" roleId="bwy9.2059702675525965926" type="bwy9.MqlNullLiteral" typeId="bwy9.6762883159245048062" id="2852142168179609475" />
                        <node role="arguments" roleId="bwy9.2059702675525965926" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179609471">
                          <property name="value" nameId="bwy9.6762883159245048053" value="12" />
                        </node>
                      </node>
                      <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="2852142168179579060" />
                    </node>
                  </node>
                  <node role="condition" roleId="bwy9.6762883159245048059" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179579030">
                    <property name="value" nameId="bwy9.6762883159245048053" value="1" />
                  </node>
                </node>
                <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlParentheses" typeId="bwy9.6762883159245048022" id="2268293679705663645">
                  <node role="expr" roleId="bwy9.6762883159245048023" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2268293679705663647">
                    <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2852142168179422949">
                      <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="2852142168179325850">
                        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlTriplex" typeId="bwy9.6762883159245048058" id="2852142168179422812">
                          <node role="thenexpr" roleId="bwy9.6762883159245048060" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179422816">
                            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
                          </node>
                          <node role="elseexpr" roleId="bwy9.6762883159245048061" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179422817">
                            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
                          </node>
                          <node role="condition" roleId="bwy9.6762883159245048059" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705663654">
                            <property name="value" nameId="bwy9.6762883159245048053" value="42" />
                          </node>
                        </node>
                        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="2852142168179422952">
                          <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179422953">
                            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
                          </node>
                          <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247139178">
                            <property name="name" nameId="tpck.1169194664001" value="wew" />
                          </node>
                        </node>
                      </node>
                      <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2852142168179325853">
                        <property name="value" nameId="bwy9.6762883159245048053" value="21" />
                      </node>
                    </node>
                    <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlTriplex" typeId="bwy9.6762883159245048058" id="2268293679705663662">
                      <node role="thenexpr" roleId="bwy9.6762883159245048060" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705663666">
                        <property name="value" nameId="bwy9.6762883159245048053" value="34" />
                      </node>
                      <node role="elseexpr" roleId="bwy9.6762883159245048061" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705663670">
                        <property name="value" nameId="bwy9.6762883159245048053" value="34" />
                      </node>
                      <node role="condition" roleId="bwy9.6762883159245048059" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="2268293679705666595">
                        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705663640">
                <property name="value" nameId="bwy9.6762883159245048053" value="32" />
              </node>
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="2852142168179572804">
              <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="3435983127247242871">
                <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="3435983127247139175" resolveInfo="aaFirst" />
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="3435983127247242611">
                <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="2268293679705614739" resolveInfo="testComma" />
              </node>
            </node>
          </node>
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="2268293679705627783">
            <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705627784">
              <property name="value" nameId="bwy9.6762883159245048053" value="6" />
            </node>
            <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247139176">
              <property name="name" nameId="tpck.1169194664001" value="aaSecond" />
            </node>
          </node>
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="2268293679705627754">
          <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="2268293679705627787">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
          <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247139175">
            <property name="name" nameId="tpck.1169194664001" value="aaFirst" />
          </node>
        </node>
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="641202304629570248">
      <property name="name" nameId="tpck.1169194664001" value="testToLower" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="641202304629570250">
        <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="5109194352282883600" resolveInfo="toLower" />
        <node role="arguments" roleId="bwy9.2059702675525965926" type="bwy9.MqlStringLiteral" typeId="bwy9.6762883159245048054" id="641202304629570251">
          <property name="value" nameId="bwy9.6762883159245048055" value="aa" />
        </node>
      </node>
    </node>
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="5433095484313962434">
      <property name="name" nameId="tpck.1169194664001" value="temporary" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="5433095484313962437">
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="5433095484313962440">
          <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="228266671027811804" resolveInfo="getInt" />
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313962436">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
      </node>
    </node>
    <node role="imports" roleId="bwy9.5109194352282852233" type="bwy9.MqlImport" typeId="bwy9.5109194352282839186" id="5109194352282893027">
      <link role="target" roleId="bwy9.5109194352282839188" targetNodeId="5109194352282883599" resolveInfo="util" />
    </node>
  </root>
  <root id="212212067812146067">
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlTemplate" typeId="h0os.212212067811886751" id="212212067812146072">
      <property name="name" nameId="tpck.1169194664001" value="template" />
      <node role="template" roleId="h0os.212212067812118827" type="h0os.MtlLibrary" typeId="h0os.212212067811886747" id="9160962589444181886">
        <property name="name" nameId="tpck.1169194664001" value="asd" />
        <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlQuery" typeId="h0os.212212067812118743" id="9160962589444181888">
          <property name="name" nameId="tpck.1169194664001" value="a" />
          <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="9160962589444199058">
            <property name="value" nameId="bwy9.6762883159245048053" value="123" />
          </node>
        </node>
        <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlQuery" typeId="h0os.212212067812118743" id="9160962589444181895">
          <property name="name" nameId="tpck.1169194664001" value="b" />
          <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="9160962589444199060">
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="9160962589444199063">
              <property name="value" nameId="bwy9.6762883159245048053" value="44" />
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlPropertyMacro" typeId="h0os.4273915927700364672" id="4273915927700610021">
                <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                <node role="query" roleId="h0os.4273915927700364674" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4273915927700610023">
                  <property name="value" nameId="bwy9.6762883159245048053" value="123" />
                </node>
              </node>
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="9160962589444199059">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
          </node>
        </node>
      </node>
      <node role="contextNode" roleId="h0os.212212067812118810" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114628963">
        <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074032" resolveInfo="Reader" />
      </node>
    </node>
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlTemplate" typeId="h0os.212212067811886751" id="1163325315882442994">
      <property name="name" nameId="tpck.1169194664001" value="asd" />
      <node role="contextNode" roleId="h0os.212212067812118810" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114628962">
        <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582069380" resolveInfo="ILazy" />
      </node>
      <node role="template" roleId="h0os.212212067812118827" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1163325315882442999">
        <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1163325315882443002">
          <property name="value" nameId="bwy9.6762883159245048053" value="12" />
        </node>
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1163325315882443003">
          <property name="value" nameId="bwy9.6762883159245048053" value="12" />
        </node>
      </node>
    </node>
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlTemplate" typeId="h0os.212212067811886751" id="3373821274546515014">
      <property name="name" nameId="tpck.1169194664001" value="aa" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="4273915927700610040">
        <property name="name" nameId="tpck.1169194664001" value="name" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlStringType" typeId="bwy9.6762883159245048070" id="4273915927700610042" />
      </node>
      <node role="vars" roleId="h0os.212212067812118824" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="3435983127247184271">
        <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247184272">
          <property name="name" nameId="tpck.1169194664001" value="ads" />
        </node>
        <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="3435983127247184277">
          <property name="value" nameId="bwy9.6762883159245048053" value="4" />
        </node>
      </node>
      <node role="vars" roleId="h0os.212212067812118824" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="3435983127247184274">
        <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247184275">
          <property name="name" nameId="tpck.1169194664001" value="xxx" />
        </node>
        <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="3435983127247184278">
          <property name="value" nameId="bwy9.6762883159245048053" value="5" />
        </node>
      </node>
      <node role="template" roleId="h0os.212212067812118827" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="3373821274546684862">
        <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="assad" />
        <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3373821274546684869">
          <property name="name" nameId="tpck.1169194664001" value="main" />
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.IntegerType" typeId="tpee.1070534370425" id="4273915927700610072" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3373821274546684871" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3373821274546684872">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3373821274546684874">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3373821274546684875">
                <property name="name" nameId="tpck.1169194664001" value="i" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="3373821274546684876" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="3373821274546684878">
                  <property name="value" nameId="tpee.1068580320021" value="0" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4273915927700610025">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4273915927700610026">
                <property name="name" nameId="tpck.1169194664001" value="s" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4273915927700610027" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4273915927700610029">
                  <property name="value" nameId="tpee.1070475926801" value="dsfsdf" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlPropertyMacro" typeId="h0os.4273915927700364672" id="4273915927700610030">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="query" roleId="h0os.4273915927700364674" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="4273915927700610047">
                      <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="6601450967974208008" resolveInfo="getString" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4273915927700610049">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4273915927700610051">
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8585534596770894513">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8585534596770894516">
                    <property name="value" nameId="tpee.1068580320021" value="1" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4273915927700610054">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3373821274546684875" resolveInfo="i" />
                  </node>
                </node>
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4273915927700610050">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3373821274546684875" resolveInfo="i" />
                </node>
              </node>
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlIfMacro" typeId="h0os.4273915927700610187" id="8585534596770971360">
                <property name="multiline" nameId="h0os.8585534596770894554" value="true" />
                <node role="condition" roleId="h0os.8585534596770839390" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="5433095484313817572">
                  <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
                  <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313817575">
                    <property name="value" nameId="bwy9.6762883159245048053" value="3" />
                  </node>
                  <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="5433095484313817568">
                    <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
                    <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313817571">
                      <property name="value" nameId="bwy9.6762883159245048053" value="2" />
                    </node>
                    <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313817567">
                      <property name="value" nameId="bwy9.6762883159245048053" value="1" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="5433095484313817576">
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlNodeQueryMacro" typeId="h0os.4273915927700610189" id="5433095484313822603">
                <node role="nodeQuery" roleId="h0os.8585534596770875710" type="bwy9.MqlNoContextQueryCall" typeId="bwy9.2059702675525965924" id="5433095484313965836">
                  <link role="query" roleId="bwy9.2059702675525965925" targetNodeId="212212067812146075" resolveInfo="getZero" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8585534596770944326">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8585534596770944327">
                <property name="name" nameId="tpck.1169194664001" value="e" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="8585534596770944328" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8585534596770944330">
                  <property name="value" nameId="tpee.1068580320021" value="5" />
                </node>
              </node>
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlIfMacro" typeId="h0os.4273915927700610187" id="8585534596770944335">
                <node role="condition" roleId="h0os.8585534596770839390" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="8585534596770944337">
                  <property name="value" nameId="bwy9.6762883159245048057" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8585534596770953199">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8585534596770953201">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8585534596770953200">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8585534596770944327" resolveInfo="e" />
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8585534596770953210">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8585534596770953213">
                    <property name="value" nameId="tpee.1068580320021" value="1" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8585534596770953209">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8585534596770944327" resolveInfo="e" />
                  </node>
                </node>
                <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlLabelNodeMacro" typeId="h0os.641202304629581072" id="641202304629636318">
                  <node role="var" roleId="h0os.641202304629581092" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="641202304630231701">
                    <property name="name" nameId="tpck.1169194664001" value="asd" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="641202304630201051">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="641202304630201052">
                <property name="name" nameId="tpck.1169194664001" value="iX" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="641202304630201053" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="641202304630201055">
                  <property name="value" nameId="tpee.1068580320021" value="5" />
                </node>
                <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlLabelNodeMacro" typeId="h0os.641202304629581072" id="641202304630201058">
                  <node role="var" roleId="h0os.641202304629581092" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="641202304630211528">
                    <property name="name" nameId="tpck.1169194664001" value="sd" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="5433095484313911455" />
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5433095484313911457">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5433095484313911458">
                <property name="name" nameId="tpck.1169194664001" value="i2" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="5433095484313911459" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="5433095484313911461">
                  <property name="value" nameId="tpee.1068580320021" value="4" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlPropertyMacro" typeId="h0os.4273915927700364672" id="5433095484313911462">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="query" roleId="h0os.4273915927700364674" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="5433095484313911465">
                      <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
                      <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313911468">
                        <property name="value" nameId="bwy9.6762883159245048053" value="3" />
                      </node>
                      <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313911464">
                        <property name="value" nameId="bwy9.6762883159245048053" value="5" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlPropertyMacro" typeId="h0os.4273915927700364672" id="5109194352282780040">
                  <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
                  <node role="query" roleId="h0os.4273915927700364674" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="641202304630231703">
                    <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="5109194352282826937" resolveInfo="as" />
                  </node>
                </node>
              </node>
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlForeachMacro" typeId="h0os.4273915927700610188" id="5433095484313911470">
                <property name="multiline" nameId="h0os.8585534596770958207" value="true" />
                <node role="collection" roleId="h0os.8585534596770839432" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="5433095484313911473">
                  <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313911474">
                    <property name="value" nameId="bwy9.6762883159245048053" value="1" />
                  </node>
                  <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313911476">
                    <property name="value" nameId="bwy9.6762883159245048053" value="2" />
                  </node>
                  <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="5433095484313911478">
                    <property name="value" nameId="bwy9.6762883159245048053" value="3" />
                  </node>
                </node>
                <node role="var" roleId="h0os.8585534596770839444" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="5109194352282826937">
                  <property name="name" nameId="tpck.1169194664001" value="as" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4273915927700610074">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4273915927700610067">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8585534596770953205">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8585534596770953208">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8585534596770944327" resolveInfo="e" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4273915927700610066">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3373821274546684875" resolveInfo="i" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4273915927700610081">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4273915927700610080">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4273915927700610026" resolveInfo="s" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4273915927700610085">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dlength()%cint" resolveInfo="length" />
                    <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlReferenceMacro" typeId="h0os.4273915927700610087" id="5433095484313911481">
                      <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                      <node role="query" roleId="h0os.4273915927700610088" type="bwy9.MqlNullLiteral" typeId="bwy9.6762883159245048062" id="5433095484313911483" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlTemplateRoot" typeId="h0os.9160962589444214864" id="1163325315882442992" />
          <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="h0os.MtlPropertyMacro" typeId="h0os.4273915927700364672" id="4273915927700610033">
            <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
            <node role="query" roleId="h0os.4273915927700364674" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="4273915927700610046">
              <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="4273915927700610040" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3373821274546684863" />
        <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3373821274546684864">
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3373821274546684865" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3373821274546684866" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3373821274546684867" />
        </node>
      </node>
      <node role="contextNode" roleId="h0os.212212067812118810" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114628961">
        <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074039" resolveInfo="CharacterReader" />
      </node>
    </node>
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlTemplate" typeId="h0os.212212067811886751" id="1163325315882432874">
      <property name="name" nameId="tpck.1169194664001" value="dsa" />
      <node role="template" roleId="h0os.212212067812118827" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1163325315882438943">
        <property name="value" nameId="tpee.1068580320021" value="123" />
      </node>
      <node role="contextNode" roleId="h0os.212212067812118810" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114628964">
        <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074032" resolveInfo="Reader" />
      </node>
    </node>
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlBuilder" typeId="h0os.212212067811886750" id="212212067812146069">
      <property name="name" nameId="tpck.1169194664001" value="build1" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="7934151313360426457">
        <property name="name" nameId="tpck.1169194664001" value="a" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlIntType" typeId="bwy9.6762883159245048069" id="7934151313360426459" />
      </node>
      <node role="body" roleId="h0os.6762883159245048634" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="7934151313360426460">
        <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="212212067812147796">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="5109194352282839185">
          <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="7934151313360426457" resolveInfo="a" />
        </node>
      </node>
      <node role="contextNode" roleId="h0os.6762883159245086410" type="xsnc.MqlNodeType" typeId="xsnc.4260762357825047862" id="6960281617114628965">
        <link role="concept" roleId="xsnc.4260762357825047863" targetNodeId="1ulq.6195190339582074043" resolveInfo="HasToString" />
      </node>
    </node>
    <node role="entities" roleId="h0os.212212067812118757" type="h0os.MtlQuery" typeId="h0os.212212067812118743" id="212212067812146075">
      <property name="name" nameId="tpck.1169194664001" value="getZero" />
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="212212067812147807">
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="212212067812147811">
          <property name="kind" nameId="bwy9.6762883159245048047" value="2" />
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="212212067812147814">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="3435983127247184270">
            <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="3435983127247184266" resolveInfo="rr" />
          </node>
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="3435983127247184265">
          <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247184266">
            <property name="name" nameId="tpck.1169194664001" value="rr" />
          </node>
          <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="3435983127247184269">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="3373821274546690914">
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="3373821274546694998">
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="3373821274546695007">
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1310998557965186557">
          <property name="kind" nameId="bwy9.6762883159245048047" value="3" />
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186560">
            <property name="value" nameId="bwy9.6762883159245048053" value="324" />
          </node>
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="3373821274546695010">
            <property name="value" nameId="bwy9.6762883159245048053" value="234" />
          </node>
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="3373821274546695002">
          <property name="value" nameId="bwy9.6762883159245048053" value="123" />
        </node>
      </node>
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918050293">
        <property name="name" nameId="tpck.1169194664001" value="a" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="3373821274546695005">
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlParentheses" typeId="bwy9.6762883159245048022" id="1310998557965186570">
        <node role="expr" roleId="bwy9.6762883159245048023" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="1310998557965186581">
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1310998557965186586">
            <property name="kind" nameId="bwy9.6762883159245048047" value="3" />
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186589">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="6711176417918083304">
              <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="3435983127247184279" resolveInfo="a" />
            </node>
          </node>
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="1310998557965186580">
            <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1310998557965186571">
              <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1310998557965186572">
                <property name="kind" nameId="bwy9.6762883159245048047" value="4" />
                <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186573">
                  <property name="value" nameId="bwy9.6762883159245048053" value="4" />
                </node>
                <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186574">
                  <property name="value" nameId="bwy9.6762883159245048053" value="3" />
                </node>
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="1310998557965186575">
                <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
                <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186576">
                  <property name="value" nameId="bwy9.6762883159245048053" value="1" />
                </node>
                <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="1310998557965186577">
                  <property name="value" nameId="bwy9.6762883159245048053" value="2" />
                </node>
              </node>
            </node>
            <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247184279">
              <property name="name" nameId="tpck.1169194664001" value="a" />
            </node>
          </node>
        </node>
      </node>
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918050294">
        <property name="name" nameId="tpck.1169194664001" value="b" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="6711176417918083306">
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918083307">
        <property name="name" nameId="tpck.1169194664001" value="a2" />
      </node>
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="6711176417918083309">
        <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="6711176417918050293" resolveInfo="a" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="1310998557965186563">
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="6711176417918050298">
        <property name="kind" nameId="bwy9.6762883159245048033" value="7" />
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="6711176417918050302">
          <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="6711176417918050301">
            <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="6711176417918050293" resolveInfo="a" />
          </node>
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="6711176417918050305">
            <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="6711176417918050294" resolveInfo="b" />
          </node>
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="1310998557965186565">
          <property name="kind" nameId="bwy9.6762883159245048033" value="7" />
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="1310998557965186564">
            <property name="value" nameId="bwy9.6762883159245048057" value="true" />
          </node>
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="1310998557965186568">
            <property name="value" nameId="bwy9.6762883159245048057" value="false" />
          </node>
        </node>
      </node>
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918050295">
        <property name="name" nameId="tpck.1169194664001" value="c" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="7862448911997407958">
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="7862448911997425373">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="7862448911997425346">
          <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="7862448911997407960">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="7862448911997425336">
              <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="7862448911997425340">
                <property name="kind" nameId="bwy9.6762883159245048047" value="4" />
                <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997425343">
                  <property name="value" nameId="bwy9.6762883159245048053" value="4" />
                </node>
                <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997425339">
                  <property name="value" nameId="bwy9.6762883159245048053" value="34" />
                </node>
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997425333">
                <property name="value" nameId="bwy9.6762883159245048053" value="123" />
              </node>
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997425335">
              <property name="value" nameId="bwy9.6762883159245048053" value="34" />
            </node>
          </node>
          <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="7862448911997425350">
            <property name="kind" nameId="bwy9.5280308256730478253" value="4" />
            <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="7862448911997425351">
              <property name="name" nameId="tpck.1169194664001" value="it" />
            </node>
            <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="4273915927700364563">
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlAssignment" typeId="bwy9.5322644393894740272" id="4273915927700364567">
                <node role="value" roleId="bwy9.5322644393894740275" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4273915927700364569">
                  <property name="value" nameId="bwy9.6762883159245048053" value="100" />
                </node>
                <node role="var" roleId="bwy9.3435983127247056179" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="3435983127247184282">
                  <property name="name" nameId="tpck.1169194664001" value="sa" />
                </node>
              </node>
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="7862448911997425354">
                <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
                <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="7862448911997425353">
                  <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="7862448911997425351" resolveInfo="it" />
                </node>
                <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="3435983127247184283">
                  <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="3435983127247184282" resolveInfo="sa" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="7862448911997425377">
          <property name="kind" nameId="bwy9.5280308256730478253" value="1" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="7862448911997425378">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="7862448911997425382">
            <property name="kind" nameId="bwy9.6762883159245048047" value="3" />
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997425385">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="7862448911997425381">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="7862448911997425378" resolveInfo="it" />
            </node>
          </node>
        </node>
      </node>
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918050296">
        <property name="name" nameId="tpck.1169194664001" value="d" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowExpressionStatement" typeId="e5td.3373821274546687071" id="6711176417918050307">
      <node role="expression" roleId="e5td.3373821274546687072" type="bwy9.MqlVariableReference" typeId="bwy9.3435983127247055506" id="6711176417918050308">
        <link role="var" roleId="bwy9.3435983127247055512" targetNodeId="6711176417918050296" resolveInfo="d" />
      </node>
      <node role="var" roleId="e5td.6711176417917933772" type="bwy9.MqlVariable" typeId="bwy9.3435983127247044629" id="6711176417918050309">
        <property name="name" nameId="tpck.1169194664001" value="qwe" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614793850" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614813003">
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614813006">
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813007">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813009">
          <property name="value" nameId="bwy9.6762883159245048053" value="3" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813011">
          <property name="value" nameId="bwy9.6762883159245048053" value="5" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813013">
          <property name="value" nameId="bwy9.6762883159245048053" value="7" />
        </node>
      </node>
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="7862448911997444580">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="7862448911997444564">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444565">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444567">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444569">
            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444571">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444573">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444575">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444577">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444579">
            <property name="value" nameId="bwy9.6762883159245048053" value="8" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="7862448911997444584">
          <property name="kind" nameId="bwy9.5280308256730478253" value="3" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="7862448911997444585">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="7862448911997444592">
            <property name="kind" nameId="bwy9.6762883159245048033" value="1" />
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="7862448911997444588">
              <property name="kind" nameId="bwy9.6762883159245048047" value="5" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444591">
                <property name="value" nameId="bwy9.6762883159245048053" value="2" />
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="7862448911997444587">
                <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="7862448911997444585" resolveInfo="it" />
              </node>
            </node>
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="7862448911997444596">
              <property name="value" nameId="bwy9.6762883159245048053" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614793852">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614793855">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793856">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793857">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793858">
              <property name="value" nameId="bwy9.6762883159245048053" value="1" />
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793859">
              <property name="value" nameId="bwy9.6762883159245048053" value="9" />
            </node>
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793860">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793861">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="4188390566614812997">
              <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813000">
                <property name="value" nameId="bwy9.6762883159245048053" value="2" />
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813001">
                <property name="value" nameId="bwy9.6762883159245048053" value="1" />
              </node>
            </node>
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793863">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793864">
              <property name="value" nameId="bwy9.6762883159245048053" value="3" />
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793865">
              <property name="value" nameId="bwy9.6762883159245048053" value="5" />
            </node>
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793866">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793867">
              <property name="value" nameId="bwy9.6762883159245048053" value="4" />
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793868">
              <property name="value" nameId="bwy9.6762883159245048053" value="1" />
            </node>
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614793869">
          <property name="kind" nameId="bwy9.5280308256730478253" value="7" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614793870">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614793871">
            <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614793872">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614793870" resolveInfo="it" />
            </node>
            <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="4188390566614793873">
              <property name="kind" nameId="bwy9.5280308256730609813" value="3" />
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793874">
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793884">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793885">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793886">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793878">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793879">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793880">
            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
          </node>
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793881">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793882">
            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793883">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614793875">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793876">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614793877">
            <property name="value" nameId="bwy9.6762883159245048053" value="9" />
          </node>
        </node>
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614813021">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="4188390566614813025">
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlComma" typeId="bwy9.6762883159245048011" id="4188390566614813029">
          <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813032">
            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
          </node>
          <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813028">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
        </node>
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813024">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614834207">
        <property name="value" nameId="bwy9.6762883159245048053" value="3" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614813035">
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614813049">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614813042">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813046">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813048">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614813053">
          <property name="kind" nameId="bwy9.5280308256730478253" value="1" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614813054">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614834161">
            <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614813054" resolveInfo="it" />
          </node>
        </node>
      </node>
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614813038">
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813039">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614813041">
          <property name="value" nameId="bwy9.6762883159245048053" value="2" />
        </node>
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614835328" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614834166">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614834175">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614834169" />
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="4188390566614834179">
          <property name="kind" nameId="bwy9.5280308256730609813" value="4" />
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614834180">
        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614834194">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614834195">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614834196">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614834199">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="4188390566614834197">
          <property name="kind" nameId="bwy9.5280308256730609813" value="4" />
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614834198" />
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614834182">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614834187">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614834185">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614834186">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="4188390566614834191">
          <property name="kind" nameId="bwy9.5280308256730609813" value="5" />
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614834192">
        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614834200">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614834201">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614834202" />
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionProperty" typeId="bwy9.5280308256730478252" id="4188390566614834204">
          <property name="kind" nameId="bwy9.5280308256730609813" value="5" />
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614834205" />
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614834193" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614835325">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614835337">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835329">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835330">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835332">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835334">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835336">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614835341">
          <property name="kind" nameId="bwy9.5280308256730478253" value="5" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614835342">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="4188390566614835345">
            <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835348">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835344">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835342" resolveInfo="it" />
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614835349">
        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614835350">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614835351">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835352">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835353">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835364">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835355">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835356">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614835357">
          <property name="kind" nameId="bwy9.5280308256730478253" value="5" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614835358">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="4188390566614835359">
            <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835360">
              <property name="value" nameId="bwy9.6762883159245048053" value="2" />
            </node>
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835361">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835358" resolveInfo="it" />
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614835362" />
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614835365" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614835367">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614835368">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835369">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835370">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835371">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835372">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835373">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614835374">
          <property name="kind" nameId="bwy9.5280308256730478253" value="6" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614835375">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="4188390566614835376">
            <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835378">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835375" resolveInfo="it" />
            </node>
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835380">
              <property name="value" nameId="bwy9.6762883159245048053" value="6" />
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614835379">
        <property name="value" nameId="bwy9.6762883159245048057" value="true" />
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614835381">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614835382">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835383">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835384">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835385">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835386">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614835388">
          <property name="kind" nameId="bwy9.5280308256730478253" value="6" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614835389">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCondition" typeId="bwy9.6762883159245048013" id="4188390566614835390">
            <property name="kind" nameId="bwy9.6762883159245048033" value="2" />
            <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835391">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835389" resolveInfo="it" />
            </node>
            <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835392">
              <property name="value" nameId="bwy9.6762883159245048053" value="6" />
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlBoolLiteral" typeId="bwy9.6762883159245048056" id="4188390566614835393" />
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614835366" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614835395">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614835407">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835398">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835423">
            <property name="value" nameId="bwy9.6762883159245048053" value="1" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835425">
            <property name="value" nameId="bwy9.6762883159245048053" value="5" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835427">
            <property name="value" nameId="bwy9.6762883159245048053" value="17" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614835411">
          <property name="kind" nameId="bwy9.5280308256730478253" value="1" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614835412">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835414">
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835415">
              <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835412" resolveInfo="it" />
            </node>
            <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="4188390566614835418">
              <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
              <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835421">
                <property name="value" nameId="bwy9.6762883159245048053" value="1" />
              </node>
              <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614835417">
                <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614835412" resolveInfo="it" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614835428">
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835429">
          <property name="value" nameId="bwy9.6762883159245048053" value="1" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835431">
          <property name="value" nameId="bwy9.6762883159245048053" value="2" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835435">
          <property name="value" nameId="bwy9.6762883159245048053" value="5" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835437">
          <property name="value" nameId="bwy9.6762883159245048053" value="6" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835439">
          <property name="value" nameId="bwy9.6762883159245048053" value="17" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614835441">
          <property name="value" nameId="bwy9.6762883159245048053" value="18" />
        </node>
      </node>
    </node>
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowStatement" typeId="e5td.3373821274546687034" id="4188390566614841680" />
    <node role="statements" roleId="e5td.3373821274546687039" type="e5td.WflowAssert" typeId="e5td.4188390566614790269" id="4188390566614841682">
      <node role="actual" roleId="e5td.4188390566614790270" type="bwy9.MqlDotExpression" typeId="bwy9.6762883159245048085" id="4188390566614841704">
        <node role="left" roleId="bwy9.6762883159245048086" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614841685">
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841686">
            <property name="value" nameId="bwy9.6762883159245048053" value="7" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841688">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841690">
            <property name="value" nameId="bwy9.6762883159245048053" value="4" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841692">
            <property name="value" nameId="bwy9.6762883159245048053" value="8" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841694">
            <property name="value" nameId="bwy9.6762883159245048053" value="6" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841696">
            <property name="value" nameId="bwy9.6762883159245048053" value="3" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841698">
            <property name="value" nameId="bwy9.6762883159245048053" value="2" />
          </node>
          <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841700">
            <property name="value" nameId="bwy9.6762883159245048053" value="10" />
          </node>
        </node>
        <node role="right" roleId="bwy9.6762883159245048089" type="bwy9.MqlCollectionSelector" typeId="bwy9.5280308256730467462" id="4188390566614841708">
          <property name="kind" nameId="bwy9.5280308256730478253" value="7" />
          <node role="var" roleId="bwy9.5280308256730662799" type="bwy9.MqlCollectionSelectorVar" typeId="bwy9.5280308256730662793" id="4188390566614841709">
            <property name="name" nameId="tpck.1169194664001" value="it" />
          </node>
          <node role="expr" roleId="bwy9.5280308256730467464" type="bwy9.MqlCollectionSelectorVarRef" typeId="bwy9.5280308256730768480" id="4188390566614841711">
            <link role="var" roleId="bwy9.5280308256730768481" targetNodeId="4188390566614841709" resolveInfo="it" />
          </node>
        </node>
      </node>
      <node role="expected" roleId="e5td.4188390566614790271" type="bwy9.MqlListLiteral" typeId="bwy9.7862448911997365751" id="4188390566614841712">
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841713">
          <property name="value" nameId="bwy9.6762883159245048053" value="2" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841715">
          <property name="value" nameId="bwy9.6762883159245048053" value="3" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841717">
          <property name="value" nameId="bwy9.6762883159245048053" value="4" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841719">
          <property name="value" nameId="bwy9.6762883159245048053" value="6" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841727">
          <property name="value" nameId="bwy9.6762883159245048053" value="6" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841729">
          <property name="value" nameId="bwy9.6762883159245048053" value="7" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841721">
          <property name="value" nameId="bwy9.6762883159245048053" value="8" />
        </node>
        <node role="elements" roleId="bwy9.7862448911997365752" type="bwy9.MqlIntLiteral" typeId="bwy9.6762883159245048052" id="4188390566614841725">
          <property name="value" nameId="bwy9.6762883159245048053" value="10" />
        </node>
      </node>
    </node>
  </root>
  <root id="5109194352282883599">
    <node role="queries" roleId="bwy9.6762883159245048633" type="bwy9.MqlQuery" typeId="bwy9.6762883159245048009" id="5109194352282883600">
      <property name="name" nameId="tpck.1169194664001" value="toLower" />
      <node role="parameters" roleId="bwy9.1992172484410518817" type="bwy9.MqlParameter" typeId="bwy9.6762883159245048635" id="5109194352282883602">
        <property name="name" nameId="tpck.1169194664001" value="s" />
        <node role="type" roleId="bwy9.6762883159245086405" type="bwy9.MqlStringType" typeId="bwy9.6762883159245048070" id="5109194352282883604" />
      </node>
      <node role="body" roleId="bwy9.6762883159245048634" type="bwy9.MqlArithmetic" typeId="bwy9.6762883159245048040" id="5109194352282883617">
        <property name="kind" nameId="bwy9.6762883159245048047" value="1" />
        <node role="left" roleId="bwy9.6762883159245048020" type="bwy9.MqlParameterReference" typeId="bwy9.6762883159245086407" id="5109194352282883605">
          <link role="parameter" roleId="bwy9.6762883159245086408" targetNodeId="5109194352282883602" resolveInfo="s" />
        </node>
        <node role="right" roleId="bwy9.6762883159245048021" type="bwy9.MqlStringLiteral" typeId="bwy9.6762883159245048054" id="5109194352282883620">
          <property name="value" nameId="bwy9.6762883159245048055" value=" lowered" />
        </node>
      </node>
    </node>
  </root>
</model>

