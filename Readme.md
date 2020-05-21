#UI Test:-Wikipedia search
Implemented BDD framework for the UI tests and the tests are passing.

Please run 
CucumberUITestOptions.java for the UI Automation test

#API Test:- petstore
Added Junit test for the API testing
Please run PetTests.java for the API Tests


#Static Analysis
Check style is implemented for this project- but getting 239 errors, hence commented out.
mvn checkstyle:checkstyle
    <reporting>
        <plugins>
          <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.1.1</version>
                <configuration>
                    <configLocation>checkstyle.xml</configLocation>
                    <failOnViolation>false</failOnViolation>
                </configuration>
            </plugin>
        </plugins>
    </reporting>
    
    Below is the check style report generated
    
    <?xml version="1.0" encoding="UTF-8"?>
<checkstyle version="8.29">
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\pages\WikiHomePage.java">
<error line="1" severity="error" message="Missing package-info.java file." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocPackageCheck"/>
<error line="7" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="9" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="11" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="11" column="23" severity="error" message="Parameter driver should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="11" column="33" severity="error" message="&apos;driver&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="15" column="3" severity="error" message="Class &apos;WikiHomePage&apos; looks like designed for extension (can be subclassed), but the method &apos;firstSearchResult&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;WikiHomePage&apos; final or making the method &apos;firstSearchResult&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="15" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="19" column="3" severity="error" message="Class &apos;WikiHomePage&apos; looks like designed for extension (can be subclassed), but the method &apos;isFirstheadingSameasSearchText&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;WikiHomePage&apos; final or making the method &apos;isFirstheadingSameasSearchText&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="19" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="19" column="49" severity="error" message="Parameter SearchText should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="19" column="56" severity="error" message="Name &apos;SearchText&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.ParameterNameCheck"/>
<error line="23" column="3" severity="error" message="Class &apos;WikiHomePage&apos; looks like designed for extension (can be subclassed), but the method &apos;checkIfSomeResultExistInOtherLanguage&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;WikiHomePage&apos; final or making the method &apos;checkIfSomeResultExistInOtherLanguage&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="23" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="23" column="56" severity="error" message="Parameter language should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="28" column="3" severity="error" message="Class &apos;WikiHomePage&apos; looks like designed for extension (can be subclassed), but the method &apos;displayResultInThisLanguage&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;WikiHomePage&apos; final or making the method &apos;displayResultInThisLanguage&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="28" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="28" column="45" severity="error" message="Parameter language should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="34" column="32" severity="error" message="Parameter language should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\pages\WikiSearchResultPage.java">
<error line="11" column="1" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="11" column="11" severity="error" message="Variable &apos;driver&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
<error line="13" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="14" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="15" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="17" column="2" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="17" column="30" severity="error" message="Parameter driver should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="17" column="40" severity="error" message="&apos;driver&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="19" column="50" severity="error" message="&apos;,&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAfterCheck"/>
<error line="19" column="51" severity="error" message="&apos;30&apos; is a magic number." source="com.puppycrawl.tools.checkstyle.checks.coding.MagicNumberCheck"/>
<error line="20" severity="error" message="Line is longer than 80 characters (found 101)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="23" column="3" severity="error" message="Class &apos;WikiSearchResultPage&apos; looks like designed for extension (can be subclassed), but the method &apos;searchTextSelectLanguage&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;WikiSearchResultPage&apos; final or making the method &apos;searchTextSelectLanguage&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="23" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="23" column="40" severity="error" message="Parameter searchText should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="23" column="59" severity="error" message="Parameter language should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="30" severity="error" message="Line is longer than 80 characters (found 90)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="30" column="66" severity="error" message="&apos;+&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="30" column="66" severity="error" message="&apos;+&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="30" column="75" severity="error" message="&apos;+&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="30" column="75" severity="error" message="&apos;+&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\Category.java">
<error line="1" severity="error" message="Missing package-info.java file." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocPackageCheck"/>
<error line="6" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="7" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="9" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="9" column="19" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="9" column="27" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="9" column="31" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="9" column="38" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="14" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="17" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;getId&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;getId&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="17" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="21" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;setId&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;setId&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="21" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="21" column="21" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="21" column="29" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="25" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;getName&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;getName&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="25" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="29" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;setName&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;setName&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="29" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="29" column="23" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="29" column="30" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="33" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;toString&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;toString&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="35" column="24" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="36" column="24" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="37" column="38" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="41" column="3" severity="error" message="Class &apos;Category&apos; looks like designed for extension (can be subclassed), but the method &apos;equals&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Category&apos; final or making the method &apos;equals&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="41" column="3" severity="error" message="Definition of &apos;equals()&apos; without corresponding definition of &apos;hashCode()&apos;." source="com.puppycrawl.tools.checkstyle.checks.coding.EqualsHashCodeCheck"/>
<error line="42" column="25" severity="error" message="Parameter o should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="50" column="49" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\Endpoints.java">
<error line="3" column="1" severity="error" message="Utility classes should not have a public or default constructor." source="com.puppycrawl.tools.checkstyle.checks.design.HideUtilityClassConstructorCheck"/>
<error line="5" severity="error" message="Line is longer than 80 characters (found 90)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="5" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="5" column="25" severity="error" message="Name &apos;ENDPOINT&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="7" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="7" column="24" severity="error" message="Name &apos;CREATE_ACCOUNT&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="7" column="24" severity="error" message="Variable &apos;CREATE_ACCOUNT&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
<error line="8" severity="error" message="Line is longer than 80 characters (found 84)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="10" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="10" column="24" severity="error" message="Name &apos;GET_ACCOUNT&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="10" column="24" severity="error" message="Variable &apos;GET_ACCOUNT&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
<error line="12" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="12" column="24" severity="error" message="Name &apos;DEPOSIT&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="12" column="24" severity="error" message="Variable &apos;DEPOSIT&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
<error line="14" severity="error" message="Line is longer than 80 characters (found 81)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="14" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="14" column="24" severity="error" message="Name &apos;WITHDRAW&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="14" column="24" severity="error" message="Variable &apos;WITHDRAW&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\Pet.java">
<error line="7" severity="error" message="Class Pet should be declared as final." source="com.puppycrawl.tools.checkstyle.checks.design.FinalClassCheck"/>
<error line="9" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="10" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="11" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="12" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="13" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="14" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="19" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="23" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="23" column="23" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="23" column="30" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="27" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="31" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="31" column="29" severity="error" message="Parameter category should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="31" column="38" severity="error" message="&apos;category&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="35" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="39" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="39" column="25" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="39" column="32" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="43" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="47" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="47" column="30" severity="error" message="Parameter photoUrls should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="47" column="43" severity="error" message="&apos;photoUrls&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="51" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="55" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="55" column="25" severity="error" message="Parameter tags should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="55" column="35" severity="error" message="&apos;tags&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="59" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="63" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="63" column="27" severity="error" message="Parameter status should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="63" column="34" severity="error" message="&apos;status&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="69" column="23" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="70" column="36" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="71" column="42" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="72" column="42" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="73" column="44" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="74" column="34" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="75" column="38" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="79" column="5" severity="error" message="Definition of &apos;equals()&apos; without corresponding definition of &apos;hashCode()&apos;." source="com.puppycrawl.tools.checkstyle.checks.coding.EqualsHashCodeCheck"/>
<error line="80" column="27" severity="error" message="Parameter o should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="88" column="48" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="89" column="61" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="90" column="53" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="91" column="63" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="92" column="53" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="97" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="98" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="99" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="100" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="101" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="102" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="104" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="108" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;withId&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;withId&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="108" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="108" column="31" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="108" column="38" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="113" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;inCategory&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;inCategory&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="113" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="113" column="35" severity="error" message="Parameter category should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="113" column="44" severity="error" message="&apos;category&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="118" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;withName&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;withName&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="118" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="118" column="33" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="118" column="40" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="123" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;withPhotoUrls&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;withPhotoUrls&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="123" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="123" column="38" severity="error" message="Parameter photoUrls should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="123" column="51" severity="error" message="&apos;photoUrls&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="128" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;withTags&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;withTags&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="128" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="128" column="33" severity="error" message="Parameter tags should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="128" column="43" severity="error" message="&apos;tags&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="133" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;withStatus&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;withStatus&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="133" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="133" column="35" severity="error" message="Parameter status should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="133" column="42" severity="error" message="&apos;status&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="138" column="9" severity="error" message="Class &apos;Builder&apos; looks like designed for extension (can be subclassed), but the method &apos;build&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Builder&apos; final or making the method &apos;build&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="138" column="9" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\PetStoreProvider.java">
<error line="14" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="14" column="26" severity="error" message="Name &apos;PET_ENDPOINT&apos; must match pattern &apos;^[a-z][a-zA-Z0-9]*$&apos;." source="com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck"/>
<error line="14" column="26" severity="error" message="Variable &apos;PET_ENDPOINT&apos; must be private and have accessor methods." source="com.puppycrawl.tools.checkstyle.checks.design.VisibilityModifierCheck"/>
<error line="14" column="78" severity="error" message="&apos;;&apos; is preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.NoWhitespaceBeforeCheck"/>
<error line="15" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="16" column="5" severity="error" message="Class &apos;PetStoreProvider&apos; looks like designed for extension (can be subclassed), but the method &apos;getPetsByStatus&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;PetStoreProvider&apos; final or making the method &apos;getPetsByStatus&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="16" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="16" column="38" severity="error" message="Parameter status should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="27" column="5" severity="error" message="Class &apos;PetStoreProvider&apos; looks like designed for extension (can be subclassed), but the method &apos;statusCodeBasedOnPetStatus&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;PetStoreProvider&apos; final or making the method &apos;statusCodeBasedOnPetStatus&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="27" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="27" column="43" severity="error" message="Parameter petStatus should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="27" column="60" severity="error" message="&apos;{&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="28" column="28" severity="error" message="&apos;=&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="28" column="28" severity="error" message="&apos;=&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="34" column="5" severity="error" message="Class &apos;PetStoreProvider&apos; looks like designed for extension (can be subclassed), but the method &apos;numberOfPetsByStatus&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;PetStoreProvider&apos; final or making the method &apos;numberOfPetsByStatus&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="34" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="34" column="37" severity="error" message="Parameter petStatus should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="35" column="28" severity="error" message="&apos;=&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="35" column="28" severity="error" message="&apos;=&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="38" column="22" severity="error" message="&apos;=&apos; is not followed by whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="38" column="22" severity="error" message="&apos;=&apos; is not preceded with whitespace." source="com.puppycrawl.tools.checkstyle.checks.whitespace.WhitespaceAroundCheck"/>
<error line="43" severity="error" message="Line is longer than 80 characters (found 86)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="43" column="34" severity="error" message="Parameter petStatus should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="43" column="52" severity="error" message="Parameter httpRequest should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="49" column="5" severity="error" message="Class &apos;PetStoreProvider&apos; looks like designed for extension (can be subclassed), but the method &apos;responseCode&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;PetStoreProvider&apos; final or making the method &apos;responseCode&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="49" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="49" column="29" severity="error" message="Parameter response should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\Status.java">
<error line="6" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="7" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="8" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="10" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="12" column="12" severity="error" message="Parameter value should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="12" column="19" severity="error" message="&apos;value&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\services\Tag.java">
<error line="7" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="8" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="10" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="10" column="14" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="10" column="22" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="10" column="26" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="10" column="33" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="15" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="18" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;getId&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;getId&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="18" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="22" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;setId&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;setId&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="22" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="22" column="21" severity="error" message="Parameter id should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="22" column="29" severity="error" message="&apos;id&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="26" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;getName&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;getName&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="26" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="30" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;setName&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;setName&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="30" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="30" column="23" severity="error" message="Parameter name should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="30" column="30" severity="error" message="&apos;name&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="34" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;toString&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;toString&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="36" column="19" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="37" column="24" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="38" column="38" severity="error" message="&apos;+&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
<error line="42" column="3" severity="error" message="Class &apos;Tag&apos; looks like designed for extension (can be subclassed), but the method &apos;equals&apos; does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class &apos;Tag&apos; final or making the method &apos;equals&apos; static/final/abstract/empty, or adding allowed annotation for the method." source="com.puppycrawl.tools.checkstyle.checks.design.DesignForExtensionCheck"/>
<error line="42" column="3" severity="error" message="Definition of &apos;equals()&apos; without corresponding definition of &apos;hashCode()&apos;." source="com.puppycrawl.tools.checkstyle.checks.coding.EqualsHashCodeCheck"/>
<error line="43" column="25" severity="error" message="Parameter o should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="51" column="44" severity="error" message="&apos;&amp;&amp;&apos; should be on a new line." source="com.puppycrawl.tools.checkstyle.checks.whitespace.OperatorWrapCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\utils\NavigationUtils.java">
<error line="1" severity="error" message="Missing package-info.java file." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocPackageCheck"/>
<error line="6" column="1" severity="error" message="Utility classes should not have a public or default constructor." source="com.puppycrawl.tools.checkstyle.checks.design.HideUtilityClassConstructorCheck"/>
<error line="8" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="8" column="43" severity="error" message="Parameter driver should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
</file>
<file name="C:\Users\Test123\Documents\wiki-petstore-tests\auto-test-framework\src\main\java\utils\ServicesUtils.java">
<error line="9" column="1" severity="error" message="Utility classes should not have a public or default constructor." source="com.puppycrawl.tools.checkstyle.checks.design.HideUtilityClassConstructorCheck"/>
<error line="11" severity="error" message="Line is longer than 80 characters (found 81)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="11" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="13" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="13" column="34" severity="error" message="Parameter endpoint should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="13" column="51" severity="error" message="Parameter method should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="17" severity="error" message="Line is longer than 80 characters (found 96)." source="com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck"/>
<error line="17" column="3" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
<error line="17" column="34" severity="error" message="Parameter endpoint should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="17" column="51" severity="error" message="Parameter method should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="17" column="70" severity="error" message="Parameter verifyStatusCode should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="22" severity="error" message="switch without &quot;default&quot; clause." source="com.puppycrawl.tools.checkstyle.checks.coding.MissingSwitchDefaultCheck"/>
<error line="35" column="34" severity="error" message="&apos;200&apos; is a magic number." source="com.puppycrawl.tools.checkstyle.checks.coding.MagicNumberCheck"/>
<error line="42" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="43" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="45" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocVariableCheck"/>
<error line="47" column="5" severity="error" message="Redundant &apos;private&apos; modifier." source="com.puppycrawl.tools.checkstyle.checks.modifier.RedundantModifierCheck"/>
<error line="47" column="24" severity="error" message="Parameter method should be final." source="com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck"/>
<error line="47" column="31" severity="error" message="&apos;method&apos; hides a field." source="com.puppycrawl.tools.checkstyle.checks.coding.HiddenFieldCheck"/>
<error line="51" column="5" severity="error" message="Missing a Javadoc comment." source="com.puppycrawl.tools.checkstyle.checks.javadoc.MissingJavadocMethodCheck"/>
</file>
</checkstyle>

