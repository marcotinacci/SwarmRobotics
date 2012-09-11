all:
	pdflatex main.tex
	bibtex main.aux
	pdflatex main.tex
	pdflatex main.tex
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f main.dvi main.synctex.gz main.ps main.run.xml main-blx.bib
classic:
	pdflatex thesis.tex
	bibtex thesis.aux
	pdflatex thesis.tex
	pdflatex thesis.tex
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f thesis.dvi thesis.synctex.gz thesis.ps thesis.run.xml thesis-blx.bib
clean:
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f main.dvi main.synctex.gz main.ps main.pdf