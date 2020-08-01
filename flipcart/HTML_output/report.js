$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/orange.feature");
formatter.feature({
  "name": "To login orange page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "page search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "First we have to open browser names \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.first_we_have_to_open_browser_names(java.lang.String)"
});
formatter.result({
  "error_message": "io.github.bonigarcia.wdm.config.WebDriverManagerException: io.github.bonigarcia.wdm.config.WebDriverManagerException: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:725)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:531)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:722)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:531)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:277)\r\n\tat steps.StepDefinition.first_we_have_to_open_browser_names(StepDefinition.java:20)\r\n\tat ✽.First we have to open browser names \"https://opensource-demo.orangehrmlive.com/\"(file:///C:/Users/mahi/eclipse-workspace/flipcart/./src/test/resources/feature/orange.feature:3)\r\nCaused by: io.github.bonigarcia.wdm.config.WebDriverManagerException: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromXml(WebDriverManager.java:839)\r\n\tat io.github.bonigarcia.wdm.managers.ChromeDriverManager.getDriverUrls(ChromeDriverManager.java:97)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.createUrlHandler(WebDriverManager.java:731)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.download(WebDriverManager.java:593)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:525)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:722)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:531)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:277)\r\n\tat steps.StepDefinition.first_we_have_to_open_browser_names(StepDefinition.java:20)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\nCaused by: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat java.net.InetAddress.getAllByName0(Unknown Source)\r\n\tat java.net.InetAddress.getAllByName(Unknown Source)\r\n\tat java.net.InetAddress.getAllByName(Unknown Source)\r\n\tat org.apache.hc.client5.http.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:43)\r\n\tat org.apache.hc.client5.http.impl.io.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:118)\r\n\tat org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:409)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:164)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:174)\r\n\tat org.apache.hc.client5.http.impl.classic.ConnectExec.execute(ConnectExec.java:135)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.ProtocolExec.execute(ProtocolExec.java:165)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.HttpRequestRetryExec.execute(HttpRequestRetryExec.java:93)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.RedirectExec.execute(RedirectExec.java:116)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.ContentCompressionExec.execute(ContentCompressionExec.java:128)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalHttpClient.doExecute(InternalHttpClient.java:178)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:75)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:89)\r\n\tat io.github.bonigarcia.wdm.online.HttpClient.execute(HttpClient.java:137)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromXml(WebDriverManager.java:827)\r\n\t... 46 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "We are trying to give username \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.we_are_trying_to_give_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "we have to give password \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.we_have_to_give_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
});