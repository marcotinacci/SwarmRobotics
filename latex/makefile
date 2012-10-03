all:
	make classic
	make nostyle
	make presentation
	
classic:
	pdflatex thesis.tex
	bibtex thesis.aux
	pdflatex thesis.tex
	pdflatex thesis.tex
	mv thesis.pdf thesis_classic.pdf
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f thesis.dvi thesis.synctex.gz thesis.ps thesis.run.xml thesis-blx.bib thesis.brf thesis.loa thesis.lof thesis.lol thesis.lot

beamer:
	pdflatex presentazione.tex
	pdflatex presentazione.tex
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~ presentazione.nav presentazione.snm

nostyle:
	pdflatex main.tex
	bibtex main.aux
	pdflatex main.tex
	pdflatex main.tex
	mv main.pdf thesis_nostyle.pdf
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f main.dvi main.synctex.gz main.ps main.run.xml main-blx.bib

clean:
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *~
	rm -f Chapters/*.aux Chapters/*.pdf Chapters/*.log
	rm -f FrontBackmatter/*.aux
	rm -f main.dvi main.synctex.gz main.ps main.pdf
	rm -f thesis.dvi thesis.synctex.gz thesis.ps thesis_classic.pdf thesis_nostyle.pdf