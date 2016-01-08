package payne.framework.pigeon.core.detector;

import java.util.Set;

/**
 * <p>
 * Description:
 * </p>
 * 
 * <p>
 * Company: 广州市俏狐信息科技有限公司
 * </p>
 * 
 * @author yangchangpei 646742615@qq.com
 *
 * @date 2016年1月8日 上午11:01:40
 *
 * @version 1.0.0
 */
public interface ClassDetector {

	Set<Class<?>> detect(ClassFilter... filters) throws DetectorException;

}
