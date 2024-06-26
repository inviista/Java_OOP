package Users;

import Items.ResearchPaper;

public class StudentResearcher extends ResearchDecorator {
    public StudentResearcher(Researcher researcher) {
        super(researcher);
    }

    @Override
    public ResearchPaper publishPaper() {
        // Поведение специфичное для студентаресерчера
        ResearchPaper paper = super.publishPaper();
        // Еще логики
        return paper;
    }

    @Override
    public double calculateHIndex() {
        // Поведение специфичное для студентаресерчера
        return super.calculateHIndex();
    }
}
