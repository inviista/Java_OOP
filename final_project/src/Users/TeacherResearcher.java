package Users;

import Items.ResearchPaper;

public class TeacherResearcher extends ResearchDecorator {
    public TeacherResearcher(Researcher researcher) {
        super(researcher);
    }

    @Override
    public ResearchPaper publishPaper() {
        // Поведение специфичное для тичерресерчера
        ResearchPaper paper = super.publishPaper();
        // Еще логики
        return paper;
    }

    @Override
    public double calculateHIndex() {
        // Поведение специфичное для тичерресерчера
        return super.calculateHIndex();
    }
}
