/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.xxl.job.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.xxl.job.executor.XxlJobExecutorApplication;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XxlJobExecutorApplication_SSTest extends XxlJobExecutorApplication_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_main_0()  throws Throwable  {
      //caseID:668b8db2c6988a489a5279832c7b3761
      XxlJobExecutorApplication xxlJobExecutorApplication0 = new XxlJobExecutorApplication();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        XxlJobExecutorApplication.main(stringArray0);
      } catch(Throwable e) {
         verifyException("org.springframework.core.io.support.SpringFactoriesLoader", e);
         assertEquals("org.smartunit.runtime.mock.java.lang.MockIllegalArgumentException", e.getClass().getName());
         assertEquals("Unable to instantiate factory class [org.springframework.boot.logging.log4j2.Log4J2LoggingSystem.Factory] for factory type [org.springframework.boot.logging.LoggingSystemFactory]", e.getMessage());
      }
  }}
