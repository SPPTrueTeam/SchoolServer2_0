package Actions.Teacher;

import ActionEntities.LessonJournal;
import Services.Interfacies.IStudyService;
import Services.ServiceException;
import Services.ServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Артем on 08.05.2016.
 */
public class UpdateLessonHomework extends ActionSupport {

    public int lessonID;
    public String homework;
    public IStudyService studyService = ServiceFactory.getStudyService();

    public String execute() throws Exception {
        try {
            studyService.UpdateLessonHomework(lessonID, homework);
            return SUCCESS;
        } catch (ServiceException ex) {
            return ERROR;
        } catch (Exception ex) {
            return ERROR;
        }
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }
}
