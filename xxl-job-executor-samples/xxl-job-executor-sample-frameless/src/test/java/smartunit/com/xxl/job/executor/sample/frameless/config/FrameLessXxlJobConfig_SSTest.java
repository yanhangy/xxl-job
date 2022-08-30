/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.xxl.job.executor.sample.frameless.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.xxl.job.core.executor.impl.XxlJobSimpleExecutor;
import com.xxl.job.executor.sample.frameless.config.FrameLessXxlJobConfig;
import java.util.Properties;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FrameLessXxlJobConfig_SSTest extends FrameLessXxlJobConfig_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_loadProperties_0()  throws Throwable  {
      //caseID:294ec23d03fc6fd442c3fc6b8ee346aa
      FrameLessXxlJobConfig frameLessXxlJobConfig0 = new FrameLessXxlJobConfig();
      // Undeclared exception!
      try { 
        FrameLessXxlJobConfig.loadProperties("0");
      } catch(Throwable e) {
         verifyException("java.io.Reader", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }
  @Test(timeout = 4000)
  public void test_destroyXxlJobExecutor_1()  throws Throwable  {
      //caseID:24db035b65b2efbc2dfb527220d28ada
      FrameLessXxlJobConfig frameLessXxlJobConfig0 = new FrameLessXxlJobConfig();
      XxlJobSimpleExecutor xxlJobSimpleExecutor0 = mock(XxlJobSimpleExecutor.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for frameLessXxlJobConfig0
      PrivateAccess.setVariable((Class<?>) FrameLessXxlJobConfig.class, frameLessXxlJobConfig0, "xxlJobExecutor", (Object) xxlJobSimpleExecutor0);

      //invoke method for frameLessXxlJobConfig0
      frameLessXxlJobConfig0.destroyXxlJobExecutor();
  }
  @Test(timeout = 4000)
  public void test_loadProperties_2()  throws Throwable  {
      //caseID:d76ee39a02f376075f5c70f2b8ec0ee5
      FrameLessXxlJobConfig.getInstance();
      Properties properties0 = FrameLessXxlJobConfig.loadProperties("");
      assertFalse(properties0.isEmpty());
  }
  @Test(timeout = 4000)
  public void test_initXxlJobExecutor_3()  throws Throwable  {
      //caseID:a4d7bd8341c9efd7f5bcf2da6f051d19
      FrameLessXxlJobConfig frameLessXxlJobConfig0 = new FrameLessXxlJobConfig();

      //invoke method for frameLessXxlJobConfig0
      frameLessXxlJobConfig0.initXxlJobExecutor();
  }}
