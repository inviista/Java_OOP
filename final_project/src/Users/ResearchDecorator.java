package Users;

import Items.ResearchPaper;

public abstract class ResearchDecorator implements Researcher {
    protected Researcher decoratedResearcher;

    public ResearchDecorator(Researcher researcher) {
        this.decoratedResearcher = researcher;
    }

    @Override
    public ResearchPaper publishPaper() {
        return decoratedResearcher.publishPaper();
    }

    @Override
    public double calculateHIndex() {
        return decoratedResearcher.calculateHIndex();
    }
}
